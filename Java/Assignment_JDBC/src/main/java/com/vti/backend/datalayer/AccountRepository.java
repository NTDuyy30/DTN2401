package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.vti.entiy.Account;
import com.vti.utils.JDBCUtils;

public class AccountRepository implements IAccountRepository {
//	properties
	private JDBCUtils jdbcUtils;

//	Constructor
	public AccountRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

//	Login
	@Override
	public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
		// Create sql statement
		String sql = "select * from `account` where username = ? and password = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, password);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.closeConnection();
			return true;
		} else {
			jdbcUtils.closeConnection();
			return false;
		}
	}

//	Register
	@Override
	public boolean register(Account account) throws SQLException, ClassNotFoundException {
		// Create sql statement
		String sql = "insert into `account`(username, password, fullname, email, phone_number, createTime) values(?, ?, ?, ?, ?, ?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, account.getUsername());
		pstm.setString(2, account.getPassword());
		pstm.setString(3, account.getFullname());
		pstm.setString(4, account.getEmail());
		pstm.setString(5, account.getPhoneNumber());
		pstm.setTimestamp(6, new Timestamp(System.currentTimeMillis()));

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

//	Check username exists
	@Override
	public boolean isUsernameExists(String username) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `account` where username = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, username);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.closeConnection();
			return true;
		} else {
			jdbcUtils.closeConnection();
			return false;
		}
	}

//	Get list accounts
	@Override
	public List<Account> getListAccounts() throws ClassNotFoundException, SQLException {
		List<Account> accounts = new ArrayList<>();

		// Create sql statement
		String sql = "SELECT * FROM `account`";

		// Execute query
		ResultSet resultSet = jdbcUtils.executeQuery(sql);

		// Handling result set
		while (resultSet.next()) {
			accounts.add(new Account(resultSet.getString("username"), resultSet.getString("password"),
					resultSet.getString("fullname"), resultSet.getString("email"), resultSet.getString("phone_number"),
					resultSet.getTimestamp("createTime")));
		}

		// disconnect
		jdbcUtils.closeConnection();

		return accounts;
	}

//	Get Account by ussername
	@Override
	public Account getAccountByUsername(String username) throws SQLException, ClassNotFoundException {
		// Create sql statement
		String sql = "select * from `account` where username = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, username);

		// Execute query
		ResultSet resultSet = pstm.executeQuery();

		// Handling result set
		if (resultSet.next()) {
			Account account = new Account(resultSet.getString("username"), resultSet.getString("password"),
					resultSet.getString("fullname"), resultSet.getString("email"), resultSet.getString("phone_number"),
					resultSet.getTimestamp("createTime"));
			// disconnect
			jdbcUtils.closeConnection();
			return account;
		} else {
			jdbcUtils.closeConnection();
			return null;
		}
	}
}

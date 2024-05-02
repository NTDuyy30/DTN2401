package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.backend.utils.JDBCUtils;

public class UserRepository implements IUserRepository {
	@Override
	public boolean insertUser(String username, String password) throws SQLException {
		Connection con = JDBCUtils.getConnection();
		String sql = "insert into users(username, password) values(?, ?)";
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, password);
		int rs = pstm.executeUpdate();
		JDBCUtils.closeConnection(con, null, pstm, null);
		return rs > 0;
	}

	@Override
	public boolean checkExists(String username, String password) throws SQLException {
		Connection con = JDBCUtils.getConnection();
		String sql = "select * from users where username = ? and password = ?";
		PreparedStatement pstm = con.prepareStatement(sql);
		pstm.setString(1, username);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		if (rs != null) {
			JDBCUtils.closeConnection(con, rs, pstm, null);
			return true;
		}
		JDBCUtils.closeConnection(con, rs, pstm, null);
		return false;
	}
}

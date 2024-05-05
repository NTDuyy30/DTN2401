package com.vti.backend.datalayer.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.backend.datalayer.ICandidateRepository;
import com.vti.entiy.ExperienceCandidate;
import com.vti.entiy.FresherCandidate;
import com.vti.utils.JDBCUtils;

public class CandidateRepository implements ICandidateRepository {
	private JDBCUtils jdbcUtils;

	public CandidateRepository() throws FileNotFoundException, IOException {
		jdbcUtils = new JDBCUtils();
	}

	@Override
	public boolean login(String email, String password) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `candidate` where email = ? and password = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, email);
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

	@Override
	public boolean registerExpCan(ExperienceCandidate exCan) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "insert into `candidate`(firstname, lastname, phone, "
				+ "email, password, expInYear, ProSkill, Category) " + "values(?, ?, ?, ?, ?, ?, ?, ?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, exCan.getFirstName());
		pstm.setString(2, exCan.getLastName());
		pstm.setString(3, exCan.getPhone());
		pstm.setString(4, exCan.getEmail());
		pstm.setString(5, exCan.getPassword());
		pstm.setByte(6, exCan.getExpInYear());
		pstm.setString(7, exCan.getProSkill().name());
		pstm.setString(8, exCan.getCategory().name());

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

	@Override
	public boolean registerFreCan(FresherCandidate freCan) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "insert into `candidate`(firstname, lastname, phone, "
				+ "email, password, GraduationRank, Category) " + "values(?, ?, ?, ?, ?, ?, ?)";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, freCan.getFirstName());
		pstm.setString(2, freCan.getLastName());
		pstm.setString(3, freCan.getPhone());
		pstm.setString(4, freCan.getEmail());
		pstm.setString(5, freCan.getPassword());
		pstm.setString(6, freCan.getGraduationRank().name());
		pstm.setString(7, freCan.getCategory().name());

		// Execute query
		int rs = pstm.executeUpdate();

		// disconnect
		jdbcUtils.closeConnection();
		return rs > 0;
	}

	@Override
	public boolean isEmailExists(String email) throws ClassNotFoundException, SQLException {
		// Create sql statement
		String sql = "select * from `candidate` where email = ?";

		// Create prepare statement
		PreparedStatement pstm = jdbcUtils.createPrepareStatement(sql);
		pstm.setString(1, email);

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

}

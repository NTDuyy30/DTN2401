package com.vti.backend.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.backend.utils.JDBCUtils;

public class UserRepository implements IUserRepository {

	@Override
	public boolean selectAllUser() {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = JDBCUtils.getConnection();
			String sql = "select * from users";
			pstm = con.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean insertUser(String username, String password) {
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = JDBCUtils.getConnection();
			con.setAutoCommit(false);
			String sql = "insert into users(username, password) values(?, ?)";
			pstm = con.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			int rs = pstm.executeUpdate();
			con.commit();
			return rs > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return false;
		} finally {
			JDBCUtils.closeConnection(con, null, pstm, null);
		}
	}
}

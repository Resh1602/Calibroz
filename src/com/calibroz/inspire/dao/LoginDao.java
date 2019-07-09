/*package com.calibroz.inspire.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.calibroz.inspire.model.LoginModel;

public class LoginDao {

	public boolean isUserFound(LoginModel ld) {
		ResultSet resultSet = null;
		Connection con = null;
		boolean isUserFound = false;
		try {
			System.out.println(DBManager.getDatasource().getConnection());
			// Connection con = DBManager.getDatasource().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			 con = DBManager.getDatasource().getConnection();
			
			//ResultSet resultSet = getResultSetByStatement(loginDetails, con);
			 resultSet = getResultSetByPreparedStatement(ld, con);
			while (resultSet.next()) {
				System.out.println(resultSet.getString("username"));
				System.out.println(resultSet.getString("password"));
				isUserFound = true;
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			resultSet.close();
			con.close();
			
		}
		return isUserFound;
	}
	
	private ResultSet getResultSetByPreparedStatement(LoginModel ld, Connection con) throws SQLException {
		String query = "SELECT * FROM Students WHERE username = ? and password= ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, ld.getUsername());
		ps.setString(2, ld.getPassword());
		ResultSet resultSet = ps.executeQuery();
		return resultSet;
	}

	

}
*/
package com.calibroz.inspire.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.calibroz.inspire.model.RegisterModel;

public class RegisterDao implements RegisterDaoImpl{

	public boolean persistData(RegisterModel registerModel) {
		ResultSet resultSet = null;
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DBManager.getDatasource().getConnection();
			resultSet = saveUser(registerModel,con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	private ResultSet saveUser(RegisterModel registerModel, Connection con) throws SQLException {
		ResultSet resultSet = null;
		int userId = 0;
		String query = "INSERT into user (userName, password) values(?, ?)";
		PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		pst.setString(1, registerModel.getUserName());
		pst.setString(2, registerModel.getPassword());
		int rows = pst.executeUpdate();
		if(rows>0) {
			resultSet = pst.getGeneratedKeys();
			while(resultSet != null && resultSet.next()) {
				userId = resultSet.getInt(1);
				if(userId>0) {
					System.out.println(userId);
				}
			}
		}
		resultSet
		 = pst.executeQuery();
		return resultSet;
	}

}

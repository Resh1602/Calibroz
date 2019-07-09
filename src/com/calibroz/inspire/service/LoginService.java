/*package com.calibroz.inspire.service;

import java.sql.SQLException;

import com.calibroz.inspire.dao.LoginDao;
import com.calibroz.inspire.model.LoginModel;

public class LoginService {

	public boolean isValid(LoginModel ld) {
		LoginDao loginDao = new LoginDao();
		boolean isValid = false;
		try {
			isValid=loginDao.isUserFound(ld);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isValid;
	}

}
*/
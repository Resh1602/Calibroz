package com.calibroz.inspire.service;

import com.calibroz.inspire.dao.RegisterDao;
import com.calibroz.inspire.model.RegisterModel;

public class RegisterService {
	
	public static void doRegister(RegisterModel registerModel) {
		RegisterDao registerDao = new RegisterDao();
		registerDao.persistData(registerModel);
		
	}

}

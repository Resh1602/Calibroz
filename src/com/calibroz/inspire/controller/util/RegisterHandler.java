package com.calibroz.inspire.controller.util;

import javax.servlet.http.HttpServletRequest;

import com.calibroz.inspire.model.RegisterModel;
import com.calibroz.inspire.service.RegisterService;

public class RegisterHandler {

	public static void processRequest(HttpServletRequest req) {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String address = req.getParameter("add");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String pin = req.getParameter("pin");
		
		RegisterModel registerModel = new RegisterModel();
		registerModel.setFname(fname);
		registerModel.setLname(lname);
		registerModel.setAddress(address);
		registerModel.setCity(city);
		registerModel.setState(state);
		registerModel.setPin(pin);
		
		System.out.println(registerModel.toString());
		
		RegisterService registerService = new RegisterService();
		registerService.doRegister(registerModel);
	}

}

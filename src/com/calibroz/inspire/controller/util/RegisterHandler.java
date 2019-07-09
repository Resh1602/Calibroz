package com.calibroz.inspire.controller.util;

import javax.servlet.http.HttpServletRequest;

public class RegisterHandler {

	public static void processRequest(HttpServletRequest req) {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		System.out.println(fname+" "+lname);
		
	}

}

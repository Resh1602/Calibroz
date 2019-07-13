package com.calibroz.inspire.controller.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHandler {

	public static void switchToHandler(String urlSegment,HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		switch (urlSegment) {
		case "app/doLogin" : LoginHandler.processRequest(req);
			break;
		case "app/doRegister" : RegisterHandler.processRequest(req);
			break;
		default :
			RedirectHandler.forwardTo("/", req, res);
			break;
		}
	}

	public static String getRequiredUrlPattern(HttpServletRequest req) {
		String uri = req.getRequestURI();
		System.out.println();
		String urlSegment = uri.substring(10);
		System.out.println(urlSegment);
		return urlSegment;

	}

}

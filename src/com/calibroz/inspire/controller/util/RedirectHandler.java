package com.calibroz.inspire.controller.util;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectHandler {

	public static void forwardTo(String urlSegment, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.err.println(urlSegment);
		RequestDispatcher rd = req.getRequestDispatcher("/"+urlSegment);
		rd.forward(req, res);
//		res.sendRedirect(urlSegment);
	}
	
}

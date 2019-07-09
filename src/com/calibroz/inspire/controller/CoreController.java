package com.calibroz.inspire.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calibroz.inspire.controller.util.RequestHandler;

/**
 * Servlet implementation class CoreController
 */
@WebServlet("/app/")
public class CoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CoreController() {
        super();
        
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlSegment = RequestHandler.getRequiredUrlPattern(request);
		RequestHandler.switchToHandler(urlSegment, request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String urlSegment = RequestHandler.getRequiredUrlPattern(request);
		RequestHandler.switchToHandler(urlSegment, request, response);
	}
	
	

	
	

}

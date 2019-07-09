package com.calibroz.inspire.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManager {
	
	public static DataSource getDatasource() {
		DataSource ds = null;
		Context initContext = null;
		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:comp/env");
			 ds = (DataSource) envContext.lookup("jdbc/UsersDB");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
		
	}

}

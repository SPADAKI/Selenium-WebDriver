package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySQL {
	// Define variables
		String mySQL, myDB, mySQLDB, myDriver,myT1, myUName, myPswd;
		String myQuery1, myQuery2;
		Connection myCon = null;
		Statement mySt;
		PreparedStatement myPst;
		ResultSet rs1, rs2;
		
	@Before
	public void mySetup () throws Exception{
		// connect to database
		// Initialize variable
		mySQL = "jdbc:mysql://sayem.blogspot.com";
		myDB = "sayem";
		mySQLDB = mySQL + myDB;
		myDriver = "com.mysql.jdbc.Driver";
		myUName = "sayem";
		myPswd = "p@ssw0rd";
		
		// Connecting to DB
		//Object myDC = Class.forName(myDriver).newInstance();
		myCon = DriverManager.getConnection(mySQLDB, myUName, myPswd);
		
	}
	
	@Test
	public void myseTest () throws Exception {
		mySt = myCon.createStatement ();		
		// Write SELECT Statement below to retrieve data from database/tables
		myQuery1 = "select * from jitr_departments;";				
		rs1 = mySt.executeQuery(myQuery1); 
		if (rs1 == null) {
			System.out.println("Empty result set");
			}
			rs1.next();
			System.out.print(rs1.getString("name"));
			System.out.print(rs1.getDouble("weight"));
	
	}
	
	@After
	public void myTeardown () throws Exception {
	// close the Database connection
	myCon.close();
	
	}	
}
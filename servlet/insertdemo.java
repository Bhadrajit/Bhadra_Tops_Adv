package com.assignment;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class insertdemo {
	public static void main(String[] args) {
		//Registering the Driver
	      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      String mysqlUrl = "jdbc:mysql://localhost/sample_database";
	      Connection con = DriverManager.getConnection(mysqlUrl, "root", "password");
	      System.out.println("Connection established......");
	      //Setting the initial value of the auto-incremented column
	      Statement stmt = (Statement) con.createStatement();
	      stmt.execute();
	      //Query to Insert values to the sales table
	      String insertQuery = "INSERT INTO Sales (ProductName, CustomerName, DispatchDate, DeliveryTime, Price, Location) VALUES (?, ?, ?, ?, ?, ?)";
	      //Creating a PreparedStatement object
	      PreparedStatement pstmt = con.prepareStatement(insertQuery,Statement.RETURN_GENERATED_KEYS);
	      PreparedStatement pstmt = con.prepareStatement(insertQuery,Statement.RETURN_GENERATED_KEYS);
	      pstmt.setString(1, "Key-Board");
	      pstmt.setString(2, "Raja");
	      pstmt.setDate(3, new Date(1567315800000L));
	      pstmt.setTime(4, new Time(1567315800000L));
	      pstmt.setInt(5, 7000);
	      pstmt.setString(6, "Hyderabad");
	      pstmt.addBatch();
	      pstmt.setString(1, "Earphones");
	      pstmt.setString(2, "Roja");
	      pstmt.setDate(3, (java.sql.Date) new Date(1556688600000L));
	      pstmt.setTime(4, new Time(1556688600000L));
	      pstmt.setInt(5, 2000);
	      pstmt.setString(6, "Vishakhapatnam");
	      pstmt.addBatch();
	      pstmt.setString(1, "Mouse");
	      pstmt.setString(2, "Puja");
	      pstmt.setDate(3, (java.sql.Date) new Date(1551418199000L));
	      pstmt.setTimestamp(4, new Timer());
	      pstmt.setInt(5, 3000);
	      pstmt.setString(6, "Vijayawada");
	      pstmt.addBatch();
	      pstmt.setString(1, "Mobile");
	      pstmt.setString(2, "Vanaja");
	      pstmt.setDate(3, new Date(1551415252000L));
	      pstmt.setTime(4, new Timer());
	      pstmt.setInt(5, 9000);
	      pstmt.setString(6, "Chennai");
	      pstmt.addBatch();
	      pstmt.setString(1, "Headset");
	      pstmt.setString(2, "Jalaja");
	      pstmt.setDate(3, (java.sql.Date) new Date(1554529139000L));
	      pstmt.setTime(4, new Timer());
	      pstmt.setInt(5, 6000);
	      pstmt.setString(6, "Goa");
	      pstmt.addBatch();
	      System.out.println("Records inserted......");
	      //Executing the batch
	      pstmt.executeBatch();
	   }
}


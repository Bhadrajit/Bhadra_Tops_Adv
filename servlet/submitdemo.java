package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/submitdemo")
public class submitdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public submitdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			String em = request.getParameter("email");
		      String un = request.getParameter("uname");
		      String pa = request.getParameter("pass");
		      String ge = request.getParameter("gender");
		      String[] co = request.getParameterValues("course");

		      response.setContentType("text/html");
		      PrintWriter pw=response.getWriter();
		      pw.write("<h2> Following data received sucessfully.. <h2> <br>");
		      pw.write("<h3> Email: "+ em +" </h3>");
		      pw.write("<h3> User name: "+ un +" </h3>");
		      pw.write("<h3> Password: "+ pa +" </h3>");
		      pw.write("<h3> Gender: "+ ge +" </h3>");
		      pw.write("<h3> Course:  ");
		      for(String c:co)
		      {
		         pw.write(  c+"   ");
		      }
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

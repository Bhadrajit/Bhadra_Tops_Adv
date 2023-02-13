package com.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/context")
public class context extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public servletcontextdemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config)
    {
    	ServletContext context = config.getServletContext();
    	ServletContext context1=config.getServletContext();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("servletconfig Demo..");
			ServletConfig context = null;
			String username=context.getInitParameter("username");
			String password=context.getInitParameter("password");
			out.println("<h1>username is.."+username);
			out.println("<br>password is.."+password);
			
			String pass=context.getInitParameter("pass");
			String user = null;
			out.println("<h1>context username is."+user);
			out.println("<br><h1>context pass is.."+pass);
		}
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	}


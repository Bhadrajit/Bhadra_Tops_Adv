package com.assignment;
import java.io.IOException;

import javax.servlet.ServletConfig;

@WebServlet("/servletconfigdemo")
public class servletconfigdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
       public servletconfigdemo() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init(ServletConfig config) throws ClassFormatException
    {
    	this.getServletConfig() ;
    	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response, ServletConfig config) throws ServletException, IOException {
		{
		 this.config=config;
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("servletconfig Demo..");
		String username= Config.getInitParameter("username");
		String password=Config.getInitParameter("password");
		out.println("<h1>username is.."+username);
		out.println("<br>password is.."+password);
	}

}

package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CustomerDao;
import com.model.CustomerModel;


@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String action=request.getParameter("action");
		if(action.equals("register"))
		{
			CustomerModel cm=new CustomerModel();
			cm.setFirstname(request.getParameter("firstname"));
			cm.setLastname(request.getParameter("lastname"));
			cm.setGender(request.getParameter("gender"));
			cm.setAddress(request.getParameter("address"));
			cm.setMobno(request.getParameter("mobno"));
			cm.setEmail(request.getParameter("email"));
			cm.setPassword(request.getParameter("password"));
			cm.setStatus("Active");
			
			int x=new CustomerDao().doCustomerRegistration(cm);
			if(x>0)
			{
				request.setAttribute("msg", "Registration Successfully...");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Registration not Successfully...");
				request.getRequestDispatcher("registration.jsp").forward(request, response);
			}
			
		}
		else if(action.equals("login"))
		{
			CustomerModel lm=new CustomerModel();
			lm.setEmail(request.getParameter("email"));
			lm.setPassword(request.getParameter("password"));
			CustomerModel m=new CustomerDao().getLogin(lm);
			if(m!=null)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("m", m);
				session.setAttribute("firstname", m.getFirstname());
				session.setAttribute("lastname", m.getLastname());
				response.sendRedirect("cust-home.jsp");
			}
			
		}
				
				
				
				
				
				
				
				
				
				
	}

}






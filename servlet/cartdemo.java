import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cartdemo")
public class cartdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public cartdemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		throws ServletException, IOException {
	        //Retrieving values from the frontend
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String address = request.getParameter("address");
	        String pincode = request.getParameter("pincode");
	        
	        //Creating Session
	        HttpSession hs = request.getSession();
	        
	        //Inserting all values inside the database
	        try {
	            //Connecting database connection and querying in the database
	            int addCustomer = DatabaseConnection.insertUpdateFromSqlQuery("insert into tblcustomer(address,email,gender,name,password,phone,pin_code)values('" + address + "','" + email + "','" + gender + "','" + name + "','" + password + "','"
	                    + mobile + "','" + pincode + "')");
	            
	            //If customer registered successfully in java online shopping system
	            if (addCustomer > 0) {
	                String message = "Customer register successfully.";
	                //Passing message via session.
	                hs.setAttribute("success-message", message);
	                //Sending response back to the user/customer
	                response.sendRedirect("customer-register.jsp");
	            } else {
	                 //If customer fails to register 
	                String message = "Customer registration fail";
	                //Passing message via session.
	                hs.setAttribute("fail-message", message);
	                //Sending response back to the user/customer
	                response.sendRedirect("customer-register.jsp");
	            }
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	}
	}

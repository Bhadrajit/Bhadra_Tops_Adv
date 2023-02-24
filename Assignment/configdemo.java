import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/configdemo")
public class configdemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public configdemo() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			{
		    	PrintWriter pw=res.getWriter();
				res.setContentType("text/html");

				ServletConfig conf=getServletConfig();

				String s1=conf.getInitParameter("n1");
				String s2=conf.getInitParameter("n2");

				pw.println("n1 value is " +s1+ " and n2 is " +s2);

			   pw.close();	
			}
		}


	
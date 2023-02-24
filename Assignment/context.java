import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/context")
public class context extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public context() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			        PrintWriter pw=res.getWriter();
			        res.setContentType("text/html");

			        // I am using 2nd way to create Context object
			        ServletContext context=getServletContext();  

			        String s1=context.getInitParameter("n1");
			        String s2=context.getInitParameter("n2");

			        pw.println("n1 value is " +s1+ " and n2 is " +s2);

			       pw.close();    
			    }
	}
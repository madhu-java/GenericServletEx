import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;



@WebServlet(urlPatterns="/fourth")
public class FourthServletClass extends GenericServlet{
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		PrintWriter out= response.getWriter();
		out.println("<h1 style='color:blue;'> writing servlet UsingAddressing genericAddressing servlet is easy</h1>");
		out.close();
	}
}
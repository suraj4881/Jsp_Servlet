package in.demo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitalizeApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
	
		out.println("<center><h1 style=color:red>Intializinig first app</h1></center>");
		out.println("<table border='5' align='center'>");
		out.println("<tr><th>ParamName</th><th>ParamValue</th></tr>");
		
		Enumeration <String> ParamName =getInitParameterNames();
		
		while(ParamName.hasMoreElements()) {
			String Paramname= (String)ParamName.nextElement();
			String value = getInitParameter(Paramname);
			out.println("<tr><td>"+Paramname+"</td><td>"+value+"</td></tr>");
			
		}
		out.println("</table>");
		out.close();
		
	}

}

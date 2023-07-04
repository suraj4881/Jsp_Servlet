package in.demo.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test")
public class TestApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Implement tomcat server class::");
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		System.out.println("implement class servletconfig in tomcat:: "+config.getClass().getName());
		System.out.println("implement class servletcontext in tomcat::"+context.getClass().getName());
		System.out.println("implement class servletrequest in tomcat::"+request.getClass().getName());
		System.out.println("implement class servletrequest in tomcat::"+response.getClass().getName());
		
	}

}

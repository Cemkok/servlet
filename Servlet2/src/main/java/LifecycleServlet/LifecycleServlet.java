package LifecycleServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle")
public class LifecycleServlet  extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		
		//konfigürasyon kısmı...
		
		System.out.println("LifecycleServlet#init!");
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.println("LifecycleServlet$doGet123");
		 
		System.out.println("LifecycleServlet#doGet is called!   ");
	}
	
	@Override
	public void destroy() {
		
		System.out.println("destroying...");
		
	}
	
	

	

}

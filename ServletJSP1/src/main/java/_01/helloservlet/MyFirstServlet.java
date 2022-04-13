package _01.helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("MyFirstServlet#doGet is called.");
		// TODO Auto-generated method stub
		
		//Dikkat !:Bu kodu silmezsen 400 hatası gibi hatalar alırsın
		//super.doGet(req, resp);
		
		PrintWriter pw=resp.getWriter();
		
		
		LocalTime localTime=LocalTime.now();
		String message="HelloServlet !!";
		
		pw.print("<h1>"+ localTime + "</h1>");
		pw.print("<h1>"+ message+ "<h1>");
	}
	

}

package encoding.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseEncodingServlet")
public class ResponseEncodingServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String defaultEncoding=resp.getCharacterEncoding();
		System.out.println(defaultEncoding); //ISO-8859-1 Latin
		
		resp.setCharacterEncoding("ISO-8859-9");
		
		
		PrintWriter pw=resp.getWriter();
		pw.print("<html>");
		pw.print("<head> <meta charset='ISO-8859-9'> </head>");
		pw.print("<body>");
		pw.print("ıİŞçÜüĞğ");
		pw.print("</body> </html>");
		
	}
	
	

}

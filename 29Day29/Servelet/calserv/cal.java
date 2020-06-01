package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cal extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter obj=res.getWriter();
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		String operation=req.getParameter("op");
		if(operation.equals("Addition"))
		{
			obj.println(i+j);
		}
		else if(operation.equals("Subtraction"))
		{
			obj.println(i-j);
		}
		else if(operation.equals("Multiplication"))
		{
			obj.println(i*j);
		}
		else if(operation.equals("Division"))
		{
			obj.println(i/j);
		}
		else {
			obj.println("not matching any operation");}
	}
}


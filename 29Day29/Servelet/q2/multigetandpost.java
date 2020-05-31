package get_post_method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class multigetandpost extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException // throwing Input Output
																							// exception
	{
		int i = Integer.parseInt(req.getParameter("num1")); // converting string to Int
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i * j;
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException // doGet method
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i * j;
		PrintWriter out = res.getWriter();
		out.println("Result is: " + k);
	}
}

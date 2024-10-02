import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import javax.servlet.*;
//import javax.servlet.http.*;
public class Home extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		out.println("<body>");
		out.println("<center><h1 style='color:black;font-style: oblique;font-size:3em;'>ONSPOT VEHICLE SERVICE SYSTEM</h1>");
		out.println("<form action='home1' method='get'>");
		out.println("<table>");
		out.println("<tr><td><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/home'><h3 style='color:red'>HOME</h3></a></td>");
		out.println("<td><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/register'><h3 style='color:blue'>REGISTER</h3></a></td>");
		out.println("<td><center><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/service1'><h3 style='color:green'>SERVICE REQUEST</h3></a></center></td>");
		out.println("<td><center><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/contact'><h3 style='color:brown'>CONTACTS</h3></a></center></td></tr>");
		out.println("<tr><td><h3>ENTER NAME</h3></td>");
		out.println("<td><input type='text' name='uname' placeholder='Enter here'></td></tr>");
		out.println("<tr><td><h3>ENTER PASSWORD	</h3></td>");
		out.println("<td><input type='password' name='pwd' placeholder='Enter here'></td>");
		out.println("</tr><tr><td><input type='reset' value='CLEAR'></td>");
		out.println("<td><input type='submit' value='LOGIN'></td>");
		out.println("<td><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/register'><h4 style='color:black'>CREATE AN ACCOUNT</h4></a></table></form></center></body>");
		}
}
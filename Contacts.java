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
public class Contacts extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("<center><h1 style='color:black;font-style: oblique;font-size:3em;'>ONSPOT VEHICLE SERVICE SYSTEM</h1></center>");
		out.println("<center><table><tr><td><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/home'><h3 style='color:red'>HOME</h3></a></td>");
		out.println("<td><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/register'><h3 style='color:blue'>REGISTER</h3></a></td>");
		out.println("<td><center><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/service1'><h3 style='color:green'>SERVICE REQUEST</h3></a></center></td>");
		out.println("<td><center><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/contact'><h3 style='color:brown'>CONTACTS</h3></a></center></td></tr></center></table>");
		out.println("<h1 style='color:blue'>CONTACT NUMBERS</h1>");
		out.println("<h1 style='color:red'>+91 9876543210</h1>");
		out.println("<h1 style='color:red'>+91 9012345678</h1>");
		out.println("<h1 style='color:blue'>E-MAIL</h1>");
		out.println("<h1 style='color:red'>vehicleservice@gmail.com</h1>");
		}
}
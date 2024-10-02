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
public class First extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		            String uname=request.getParameter("uname");
		            String pwd=request.getParameter("pwd");
		            out.println("<input type='hidden' name='uname' value='"+uname+"'>");
	                out.println("<input type='hidden' name='pwd' value='"+pwd+"'>");
		            try{
		                Class.forName("com.mysql.cj.jdbc.Driver");
		                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/input","root","Vvr@2004");
		                Statement stmt=con.createStatement();
		    			ResultSet rs=stmt.executeQuery("select * from regi where uname='"+uname+"'and pwd='"+pwd+"'");
		                if(rs.next())
		                out.println("<h1 style='color:blue'>Login sucessful!!</h1><br><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/service1'><h1 style='color:green'>PROCEED</h1></a>");
		                
		                else
		                {
		                out.println("<h1 style='color:red'>Login failed!!!!!!</h1><br>");
		                out.println("<a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/register'><h1 style='color:green'>CREATE AN ACCOUNT</h1></a>");
		              }
		            }
		               catch(Exception e) {
		                   e.printStackTrace();
		                        }
		            }
		        		
		}


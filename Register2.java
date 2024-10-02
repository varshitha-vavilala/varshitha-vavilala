import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String email = request.getParameter("email");
        String mobno = request.getParameter("mobno");
        String pwd1 = request.getParameter("pwd1");
        String pwd = request.getParameter("pwd");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><style>");
        out.println("body { font-family: Arial, sans-serif; background: url('https://images.ctfassets.net/2sam6k0rncvg/70AdJSPnZZbuI93ZDKrwz6/38119f4aa3318a4af787d1c3d5b16828/temporary-vehicle-registration-number.png') no-repeat center center fixed; background-size: cover; }");
        out.println("h1 { color: black; font-style: oblique; font-size: 3em; }");
        out.println("h2 { color: black; }");
        out.println("table { margin: auto; }");
        out.println("td { padding: 10px; }");
        out.println("input[type='submit'] { padding: 10px 20px; border: none; border-radius: 5px; background-color: #28a745; color: white; cursor: pointer; }");
        out.println("input[type='submit']:hover { background-color: #218838; }");
        out.println("a { text-decoration: none; color: inherit; }");
        out.println(".nav { background-color:#fff; padding: 10px; display: flex; align-items: center; justify-content: space-between; }");
 
        out.println(".nav-links { display: flex; gap: 15px; }");
        out.println(".nav-links a { color: red; font-size: 18px; }");
        out.println(".nav-links a:hover { color: darkred; }");
        out.println("</style></head><body>");
        out.println("<nav class='nav'><img src='https://via.placeholder.com/50' alt='Logo'>");
        out.println("<div class='nav-links'>");
        out.println("<a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/home'>HOME</a>");
        out.println("<a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/register'>REGISTER</a>");
        out.println("<a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/service1'>SERVICE REQUEST</a>");
        out.println("<a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/contact'>CONTACTS</a>");
        out.println("</div></nav>");
        out.println("<center><h1>ONSPOT VEHICLE SERVICE SYSTEM</h1></center>");
        
        if (pwd.equals(pwd1)) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/input", "root", "Vvr@2004");
                PreparedStatement ps = con.prepareStatement("insert into regi values(?,?,?,?)");
                ps.setString(1, uname);
                ps.setString(2, pwd);
                ps.setString(3, mobno);
                ps.setString(4, email);
                int nor = ps.executeUpdate();
                out.println("<center><h1 style='color:blue'>REGISTERED SUCCESSFULLY!</h1><br><a href='http://localhost:8083/COURSE_PROJECT_BATCH_7/service1'><h1 style='color:green'>PROCEED</center>");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            out.println("<center><h1 style='color:red'>PLEASE ENTER PASSWORD CORRECTLY</h1></center>");
        }
        
        out.println("</body></html>");
    }
}

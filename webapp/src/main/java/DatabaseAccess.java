import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.*;

public class DatabaseAccess extends HttpServlet{

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
            try {
     String fname=request.getParameter("FirstName");
      String lname=request.getParameter("LastName"); 
      String e=request.getParameter("E-mail");
      String d=request.getParameter("Date");
       String t=request.getParameter("Time");
       String topic=request.getParameter("Topic");
        String l=request.getParameter("Location");

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      /*String title = "Database Result";
      
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      
      out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor = \"#f0f0f0\">\n" +
         "<h1 align = \"center\">" + title + "</h1>\n");*/
      
         // Register JDBC 
         Class.forName("com.mysql.jdbc.Driver");
 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "");

 PreparedStatement ps=conn.prepareStatement("insert into login values(?,?,?,?,?,?,?)");
 ps.setString(1,fname); 
ps.setString(2,lname); 
ps.setString(3,e); 
ps.setString(4,d);
//ps.setDate(4, (java.sql.Date)dt);
ps.setString(5,t); 
ps.setString(6,topic); 
ps.setString(7,l); 
int i=ps.executeUpdate(); 
if(i>0) 
out.print("You are successfully registered..."); 
         //Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
        // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root","");

         // Execute SQL query
         //Statement stmt = conn.createStatement();
         //String sql;
         //sql = "insert into login values(fname,lname,e,d,t,topic,l)";
         //stmt.executeUpdate(sql);
         out.println("executed Successfully");
      }

         // Extract data from result set
        /* while(rs.next()){
            //Retrieve by column name
            int id  = rs.getInt("id");
            int age = rs.getInt("age");
            String first = rs.getString("first");
            String last = rs.getString("last");

            //Display values
            out.println("ID: " + id + "<br>");
            out.println(", Age: " + age + "<br>");
            out.println(", First: " + first + "<br>");
            out.println(", Last: " + last + "<br>");
         }
         out.println("</body></html>");

         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      } catch(SQLException se) {
         //Handle errors for JDBC
         se.printStackTrace();
      }*/
      catch(Exception e) {
         //Handle errors for Class.forName
         e.printStackTrace();
      } 
      //finally {
            //finally block used to close resources
         /*try {
            if(stmt!=null)
               stmt.close();
         } catch(SQLException se2) {
         } // nothing we can do
         try {
            if(conn!=null)
            conn.close();
         } catch(SQLException se) {
            se.printStackTrace();
         } //end finally try*/
     // } //end try*/
   }
} 
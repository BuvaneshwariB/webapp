import java.io.*;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.sql.*;

@WebServlet(name="SendToStudent"  , urlPatterns="/SendToStudent")

public class SendToStudent extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  

//set values to variables get from user
String name=request.getParameter("sname");
int id=Integer.parseInt(request.getParameter("sid"));
String date=request.getParameter("date");
String dept=request.getParameter("dept");
int phone=Integer.parseInt(request.getParameter("phone"));

//set values to Student class

Student p=new Student();

p.setName(name);
p.setId(id);
p.setDate(date);
p.setDept(dept);
p.setPhone(phone);

int present=StudentDao.insert1(p);
if(present>0)
{
    out.println("inserted successfully");
}
else
{
    out.println("insertion unsuccess");
}
//out.println("<img src='/images/com.jpg' alt='success'/>");

}
         }

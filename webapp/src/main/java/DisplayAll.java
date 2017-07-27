import java.io.*;
import java.sql.*;
import java.lang.*;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="DisplayAll",urlPatterns="/DisplayAll")

public class DisplayAll extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        List<Student> l1=StudentDao.viewAll();
       for(Student e:l1)
       { // out.println("<center><head><style> </head>") ;
out.print("<center><div background-color:'grey'><table>");

out.print("<div background-color:'white'><tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getDate()+"</td><td>"+e.getDept()+"</td><td>"+e.getPhone()+"</td></tr></table></div></div>");
out.print("</center>");
//out.print("Name"+e.getName()+ "Id"+e.getId()+ "Date"+e.getDate()+ "Salary"+e.getSalary()+ "Phone"+e.getPhone()+ "\n");

    }
}
}
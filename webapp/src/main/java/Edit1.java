import java.sql.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/Edit1")
public class Edit1 extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
              response.setContentType("text/html");
              PrintWriter out=response.getWriter();
              int id=Integer.parseInt(request.getParameter("id"));
              Student p=StudentDao.getUpdate1(id);
              System.out.println(p);
               out.print("<form action='Edit2' method='get'>");
              
               out.print(" Name:<input type='text' name='name' value='"+p.getName()+"'/><br>");
                out.print("Id:<input type='text' name='id' value='"+p.getId()+"'/ ><br>");
                out.print("Date:<input type='text' name='date' value='"+p.getDate()+"'><br>");
                out.print("Dept:<input type='text' name='dept'value='"+p.getDept()+"'><br>");
                out.print("Phone:<input type='text' name='phone' value='"+p.getPhone()+"'><br>");
                out.print("<input type='submit' value='Update'><br>");
                out.print("</form>");



    }

}


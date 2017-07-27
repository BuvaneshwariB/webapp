# SERVLET PROJECT
   Servlets provide a component-based, platform-independent method for building Webbased applications, without the performance limitations of CGI programs.
# SERVLET PROJECT 
# DESCRIPTION
    To create the Event Registration in servlet, I have separated the database logic from the servlet. Here, I'm mixing the database logic in the servlet only for simplicity of the program. I have developed this project in JSP using DAO, DTO and Singleton design pattern. We have performed,
1. Create basic web application using maven command line
2. dependencies
3. plugins
4.  Write Hello world servlet
5.  Omit web.xml
6.  Use WebServlet annotation
7.  Use POJO class
8.  Do all CRUD Operations 
9.  Use OOPS in Servlet class
10. Use Bootstrap for HTML page
11. Create Login page
12. Login with username, password, submit, cancel 
13. Use Session to validate username, password
14. Use Filter and filter chaining
15. Write error page
16. Use send mail
# My Programs
# HTML
  - bootstrap.html
  - bootstrap1.html
  - action.html
  - delete.html
  - update.html
# JAVA
- MyFilter.java
- First.java
- SendToStudent.java
- Student.java
- StudentDao.java
- DisplayAll.java
- Edit1.java 
- Edit2.java
- DeleteServlet.java
- mainservlet.java
# DATABASE
- college
# TABLE
- student

# CODE
# HTML CODE
1. BOOTSTRAP.html
# DESCRIPTION
    In this page, I'm getting input from the user using text fields(i.e.,UserName and Password).The information entered by the user is forwarded to MyFilter servlet.


```
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
    .jumbotron {
    margin-bottom: 0px;
    background-image: url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTX_LhZgvFM915-gyfNmh61_N_nsJoV5GWSNJvYCsYYXaSIfaGczw);
    background-size: cover;
    background-repeat: no-repeat;
    color: white;
    text-shadow: black 0.3em 0.3em 0.3em;
    height:900px;
    }
    </style>
<body>

<div class="jumbotron " >
  
  <center>

   <!--<background="images.jpg" width=50%>-->
            <div class="container">
                <div class="container">
      </div>
<div class="header text-center">
<h1 align="center">Login</h1>
<ul class="nav nav-pills pull-right">
<li class="active"><a href="bootstrap1.html">Register</a></li>
<li class="active" id="register"><a href="bootstrap.html">cancel</a></li>
</ul>

<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
            <form action="First" method="post">
            <input type="text" id="userName" name="user" class="form-control input-sm chat-input" placeholder="username" />
            </br>
            <input type="text" id="userPassword" name="pass" class="form-control input-sm chat-input" placeholder="password" />
            </br>
            
            <h3><span class="group-btn" ><a href="action.html">login<i class="fa fa-sign-in" color="white"></i></span></h3>
           
            </center>
              
                <!--<a href="First" class="btn btn-primary btn-md">login </a>-->
            
           
            </div>
        </div>
</div>
        </div>
    </div>
</div>
</div>
</body>
</html>
```

 
2. BOOTSTRAP1.html
# DESCRIPTION
       Here I register the details of students and insert them into database for retrieving it later.

```
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center" border-size:cover>
  
  <img src="image1.jpg" width=46%></img>
</div>
  
<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<html>
    <head>
     <title>Student</title>
    </head>
    
    <body>
        
           
<div class="container.fluid">
    
    <div class="row">
        <div class="col-md-offset-5 col-md-3">
            <div class="form-login">
                 
            <u><h4 style="text-align:center">STUDENT DETAILS</h4></u>
           <form action="SendToStudent" method="GET">
            Name:<input type="text"name="sname" class="form-control input-sm chat-input" />
            </br>
            Id:<input type="text" name="sid" class="form-control input-sm chat-input"  /> 
            <br>
            Date of Birth:<input type="text" name="date" class="form-control input-sm chat-input"  />
            <br>
            Department:<input type="text" name="dept" class="form-control input-sm chat-input"  />
            <br>
            Phone:<input type="text" name="phone" class="form-control input-sm chat-input"  />
            <br>
            
           
            <div class="wrapper">
                <div style="text-align:center"> 
            <span class="group-btn"><input type="submit" value="SUBMIT" ><i class="fa fa-sign-in"></i></td></tr></span>
           </table>
     </form>
     
            
               </div>   
                <!--<a href="First" class="btn btn-primary btn-md">login </a>-->
            
           
            </div>
        
        </div>
    </div>
</div>
</body>
</html>
```
3. ACTION.html
# DESCRIPTION
      This page is designed to CRUD Operations(View, Insert, Delete and Update) 
```

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="jumbotron text-center" border-size:"cover">
  
  <img src="download.jpeg" width=70%></img>  
  <div class="container">
<div class="header">
<ul class="nav nav-pills pull-right">
<li class="active jumbotron text-center" ><a href="DisplayAll"> view  <i class="fa fa-desktop"></i></li></a>
<li class="active jumbotron text-center" ><a href="delete.html"> Delete <i class="fa fa-trash"></i></li></a>
<li class="active jumbotron text-center" ><a href="update.html"> Update <i class="fa fa-pencil-square-o"></i></li></a>
<li class="active jumbotron text-center"><a href="bootstrap.html"> Logout <i class="fa fa-share-square-o"></i></a></li>
</ul>
</div>
</div>
</div>
</body>
</html>
```
4. DELETE.html
# DESCRIPTION
       This page is used to get the input from the user which they want to delete.
```
<html>
    <head>
        <title>hello</title>
        </head>
        <body>
            <form action="DeleteServlet" method="get">
                Name:<input type="text" name="name"><br>
                <input type="submit" value="delete"><br>
                </form>
                </body>
                </html>


```
5. UPDATE.html
# DESCRIPTION
       In this page, the data of the particular user which is to be updated is brought and directed to Edit1.java page.
```
<html>
    <head>
        <title>hello</title>
        </head>
        <body>
            <form action="Edit1" method="get">
                Id:<input type="text" name="id"><br>
                <input type="submit" value="update"><br>
                </form>
                </body>
                </html>

```
# JAVA CODE
1. MyFilter.java
# DESCRIPTION
     I've created MyFilter,to filter the users who login with the help of password and is chained to the next servlet page(Using FilterChain interface). Inorder to perform filter operation we must implement the Filter interface. Filter interface provides the life cycle methods for a filter like,
                               1. public void init(FilterConfig config)
                               2. public void doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain   chain)
                               3. public void destroy()
     The object of FilterChain is responsible to invoke the next filter or resource in the chain.This object is passed in the doFilter method of Filter interface.The FilterChain interface contains only one method:

```
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Filter.*;
import javax.servlet.annotation.WebFilter;
@WebFilter(filterName="MyFilter", urlPatterns="/First")
 public class MyFilter implements Filter {
   
    public void init(FilterConfig fc) throws ServletException {}
    
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String pass = request.getParameter("pass");
        if(pass.equals("1234"))
        {
         chain.doFilter(request, response);   
        }
        else
        {
            out.println("You have enter a wrong password");
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.include(request, response);
        }
    }
   public void destroy() { }
}
```

2. First.java
# DESCRIPTION
        Here the data which has been filtered in MyFilter is obtained and forwarded to bootstrap1.html. 

```
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.Filter;
import javax.servlet.annotation.WebServlet;
@WebServlet(name="First", urlPatterns="/First")

 public class First extends HttpServlet {

 public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
     {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("user");
        out.println("Welcome "+user);
        response.sendRedirect("bootstrap1.html");
     }
}
```
3. SendToStudent.java
# DESCRIPTION
      In this page, the details which were passed in bootstrap1.html are being got and set in the POJO class(Student.java) and then calls for DAO class methods(StudentDao.java).
```
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

```
4. Student.java

# DESCRIPTION
       This POJO class is used to specify the student properties.
```
public class Student
{
    private String name;
    private int id;
    private String date;
    private String dept;
    private int phone;
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()

       {   
           return name;      
       }
       public void setId(int id)
       {
          this.id=id;
        
       }
       public int getId()
       {
           return id;
       }
       public void setDate(String date)
       {
            this.date=date;
       }

       public String getDate()
       {
           return date;
       }
       public void setDept(String dept)
       {
           this.dept=dept;
       }
        public String getDept()
        {
            return dept;
        }

        public void setPhone(int phone)
        {
            this.phone=phone;
        }
        public int getPhone()
        {
            return phone;
        }
    }
```
5. StudentDao.java
# DESCRIPTION
       StudentDao.java provides some specific data operations(insert,delete,update,view) without exposing details of the database. The methods which we use are as follows, 
           getConnection() - connection to the database.
           insert1(Student p)-Object of Student that passed is inserted into database using SQL(Insert Query).
           getUpdate1()- Data which are to be updated are being brought here using SELECT query and is forwarded to Edit1.java.
           Update2() - Data obtained are updated here using UPDATE query.
           deleteMethod() - Delete the details of specified student.
           viewAll() - To display the information stored in database. 
```
import java.util.*;
import java.sql.*;
import java.sql.Date.*;

public class StudentDao 
{
public static Connection getConnection()
{ 
    Connection c=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    c=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
}
catch(Exception e)
{
  e.printStackTrace();
}
return c;
}
public static int insert1(Student p)
{
    int present=0;

   try {

Connection c=StudentDao.getConnection();
PreparedStatement ps=c.prepareStatement("insert into student(name,id,date,dept,phone)values(?,?,?,?,?)");
ps.setString(1,p.getName());
ps.setInt(2,p.getId());
ps.setString(3,p.getDate());
ps.setString(4,p.getDept());
ps.setInt(5,p.getPhone());

present=ps.executeUpdate();
c.close();
}
catch(Exception e){
    System.out.println(e);

}
return present;
}
public static int update2(Student p)
{
 int n=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("update Student set name=?,date=?,dept=?,phone=? where id=?");  
            ps.setString(1,p.getName());
            ps.setString(2,p.getDate());
            ps.setString(3,p.getDept());
            ps.setInt(4,p.getPhone());
            ps.setInt(5,p.getId());  
            n=ps.executeUpdate();  
              
            con.close(); 

        }catch(Exception e){e.printStackTrace();}  
          
        return n;  
    } 


public static int deleteMethod(String name)
{
 int status=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from Student where name=?");  
            ps.setString(1,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    } 
      public static Student getUpdate1(int id)
{
    Student p=new Student();
 int n=0;  
        try{  
            Connection con=StudentDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Student where id=?");  
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){

p.setName(rs.getString(1));
p.setId(rs.getInt(2));
p.setDate(rs.getString(3));
p.setDept(rs.getString(4));
p.setPhone(rs.getInt(5));


            }

            
            con.close(); 

        }catch(Exception e){e.printStackTrace();}  
          
        return p;  
    }

public static List<Student> viewAll()

{
List<Student> list=new ArrayList<Student>();

try{
    Connection c=StudentDao.getConnection();
    PreparedStatement ps=c.prepareStatement("select * from student");
    ResultSet rs=ps.executeQuery();
    while(rs.next())
    {
       Student e=new Student();
       e.setName(rs.getString(1));
       e.setId(rs.getInt(2));
       e.setDate(rs.getString(3));
       e.setDept(rs.getString(4));
       e.setPhone(rs.getInt(5));
    list.add(e);    
  }
  c.close();
}
catch(Exception e){
    System.out.println(e);
}
return list;
}
}
```
6. DisplayAll.java
# DESCRIPTION
     This is used to display the details of the students registered.
```
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
```
7. DeleteServlet.java
# DESCRIPTION
        To delete the details of specified student by forwarding it to StudentDao.java.
     
```
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;  

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        
System.out.println("hello delete");
       //String sid=request.getParameter("id");
       //int id=Integer.parseInt(sid);
       response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       String name=request.getParameter("name");
       System.out.print("hello delete"+name);
       
    int status= StudentDao.deleteMethod(name);
    /*if(status==0)
    {
        out.println("unsuccess");
    }
    else{
     out.println("successs");
    }*/

     response.sendRedirect("DisplayAll");

    }
}
```
8. Edit1.java
# DESCRIPTION
    Getting details of student to update
```
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


```
9. Edit2.java
# DESCRIPTION
Updating the student detail in database using update query
```
import java.util.*;
import java.sql.*;
import java.io.*;
import java.lang.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException; 
@WebServlet("/Edit2")
public class Edit2 extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        int id=Integer.parseInt(request.getParameter("id"));
        String date=request.getParameter("date");
        String dept=request.getParameter("dept");
        int phone=Integer.parseInt(request.getParameter("phone"));
        Student p=new Student();
        p.setName(name);
        p.setId(id);
        p.setDate(date);
        p.setDept(dept);
        p.setPhone(phone);
        int n=StudentDao.update2(p);
        if(n>0)
        {
            out.println("Successfully Updated");
        }
        else
        {
            out.println(" not Updated");
        }
         response.sendRedirect("DisplayAll");


    } 
}
```
10. mainservlet.java
# DESCRIPTION
Sending mail to student who have registered in database 
```

import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.*;
import java.net.Authenticator;
import java.util.*; 

@WebServlet("/mainservlet")
@MultipartConfig(location="C://TEMP")
public class mainservlet extends HttpServlet {
   mainservlet javaEmail=null;
 public void init() throws ServletException { 

    
      //System.out.println("i am init");
   }
     public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException
       {
        
           response.setContentType("text/html");
            PrintWriter out = response.getWriter();
     
         response.setContentType("text/html;charset=UTF-8");
              
        String toMail = request.getParameter("email");
        String filename=request.getParameter("filename");
        request.getPart("content").write("C://TEMP/"+filename+".txt");
         if(request.getPart("content") !=null){
        	out.write("<h3>File uploaded successfully</h3>");}
        String cc=request.getParameter("cc");
          String[] recipientList = cc.trim().split(",");

          try {
           mainservlet javaEmail = new mainservlet();
          
          for(String dd: recipientList)
          {

         javaEmail.sendEmail(toMail,dd);
           }
            
            out.println("Process Completed\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println("event registered successfully");
    }

        public static void sendEmail(String to,String ddd)
{
final String username = "buvaneshwari.b@kggroup.com";
final String password = "bhuvi@123";
Properties props = new Properties();
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.starttls.enable", "false");
props.put("mail.smtp.host", "webmail.kggroup.com");
props.put("mail.smtp.port", "25");
Session session = Session.getInstance(props,
new javax.mail.Authenticator() {
protected PasswordAuthentication getPasswordAuthentication() {
return new PasswordAuthentication(username, password);
}
});
try {
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("buvaneshwari.b@kggroup.com"));
message.setRecipients(Message.RecipientType.TO,
InternetAddress.parse(to));
message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ddd));
message.setSubject("A testing mail header !!!");
message.setText("Dear Mail Crawler,"
+ "\n\n No spam to my email, please!");
Transport.send(message);
System.out.println("Done");
}
catch (MessagingException e) 
{
throw new RuntimeException(e);

}
}

}
```
# Screenshots
![bootstrap.html](https://github.com/santhoshRJ/MyServlet/blob/master/images/Login.png)

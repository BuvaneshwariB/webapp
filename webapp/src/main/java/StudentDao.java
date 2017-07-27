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
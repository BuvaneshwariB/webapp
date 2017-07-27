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
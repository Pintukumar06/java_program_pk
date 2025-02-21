package class and object;

class student{

    String name;
    int id;
    void study()
    {
      System.out.println("student "+name+" is studying");
    }
      void sleep()
      {
          System.out.println("student "+id+" is sleeping");
      }
    
      public class classexp {
      public static void main(String[] args) {
          student s1=new student();
          s1.name="RAMA";
          s1.id=101;
          s1.study();
          student s2=new student();
          s2.name="SITA";
          s2.id=102;
          s2.sleep();
      }
  
    }   
  }

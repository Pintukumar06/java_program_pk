public class lastIndexOf 
{
 public static void main(String[] args) {
     String str="Developer";
     System.out.println(str.lastIndexOf('P'));
     System.out.println(str.lastIndexOf('o'));
     System.out.println(str.lastIndexOf('n'));
     System.out.println(str.lastIndexOf('e'));
     int x=str.lastIndexOf('e');
     int y=str.lastIndexOf('e',x-1);
     int z=str.lastIndexOf('e',y-1);
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
 }   
}

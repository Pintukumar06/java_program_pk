public class containsstartsendswith 
{
 public static void main(String[] args) {
     String str="Engineering";
     System.out.println(str.contains("job"));
     System.out.println(str.contains("gin"));

     System.out.println(str.startsWith("engine"));
     System.out.println(str.startsWith("Eng"));
     
     System.out.println(str.endsWith("i ng"));
     System.out.println(str.endsWith("ring"));

 }   
}

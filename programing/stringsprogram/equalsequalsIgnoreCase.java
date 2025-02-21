public class equalsequalsIgnoreCase 
{
 public static void main(String[] args) {
     String str="j2ee";
     System.out.println(str.equals("J2ee"));
     System.out.println(str.equals("j2ee"));
     System.out.println(str.equals("adv Java"));

     System.out.println(str.equalsIgnoreCase("J2ee"));
     System.out.println(str.equalsIgnoreCase("j2ee"));
     System.out.println(str.equalsIgnoreCase("adv Java"));
 }   
}

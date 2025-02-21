
import java.util.Scanner;

public class scannerexp3 
{
 public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     System.out.println("enter integer");
     int a = scn.nextInt();
     System.out.println("enter Double");
     double d = scn.nextDouble();
     System.out.println("enter boolean");
     boolean b = scn.nextBoolean();
     System.out.println("Integer : "+a);
     System.out.println("Double : "+d);
     System.out.println("Boolean : "+b);
 }   
}

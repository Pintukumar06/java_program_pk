import java.util.Scanner;
public class scannerexp 
{
 public static void main(String[] args) 
 {
     Scanner scn = new Scanner(System.in);
     System.out.println("enter number");
     int num=scn.nextInt();
     if(num%2==0)
     {
        System.out.println("even number");
     }
     else
     {
        System.out.println("odd number");
     }
 }   
}

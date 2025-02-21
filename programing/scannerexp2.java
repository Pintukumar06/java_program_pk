import java.util.Scanner;
public class scannerexp2 
{
    public static void main(String[] args)
    {
     Scanner scan = new Scanner(System.in);
     System.out.println("enter value 1");
     double num1 = scan.nextDouble();
     System.out.println("enter value 2");
     double num2 = scan.nextDouble();
     double sum=num1+num2;
     System.out.println("sum : "+sum);
    }
}

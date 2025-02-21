import java.util.Scanner;

public class scannerexp5 
{
 public static void main(String[] args) 
 {
   Scanner scn=new Scanner(System.in);
   char ch=scn.next() .charAt(0);
   System.out.println("value : "+ch);  
 }   
}
//we can not read char values in java using scanner
//in this exmples we are reading string value and extracting the character.
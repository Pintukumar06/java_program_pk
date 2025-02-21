public class split 
{
 public static void main(String[] args) {
     String str="java is an object oriented programming language";
     String[] arr=str.split(" "); //{"Java","is","an","Object","Oriented","Programming","Language"};
     for(int i=0; i<arr.length; i++)
     {
        System.out.println(arr[i]);
     }
 }   
}

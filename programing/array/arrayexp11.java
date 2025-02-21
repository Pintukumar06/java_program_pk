package array;

public class arrayexp11 
{
 public static void main(String[] args) {
     int[] arr={7500,7200,7300,7250,8000};
     int sum=0;
     for(int i=0; i<arr.length; i++)
     {
        sum=sum+arr[i];
     }
     int avg=sum/arr.length;
     System.out.println("avg : "+avg);

 }   
}

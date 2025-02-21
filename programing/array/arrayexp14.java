package array;

public class arrayexp14 
{
 public static void main(String[] args) {
     int[] arr={11,12,13,14,15,16};
     int value=14;
     boolean flag=false;
     for( int i=0; i<arr.length; i++)
     {
        if(arr[i]==value)
        {
            System.out.println(value + " found at index"+i);
            flag=true;
        }
     }
     if(flag==false)
     {
        System.out.println(value + " not found at in array");
     }
 }   
}

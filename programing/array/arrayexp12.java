package array;

public class arrayexp12 
{
  public static void main(String[] args) {
      int[] arr={12,14,19,17,16};
      int large=arr[0];
      for(int i=1; i<arr.length; i++)
      {
        if(arr[i]>large)
        {
            large=arr[i];
        }
      }
      System.out.println("Largest value : "+large);
  }  
}

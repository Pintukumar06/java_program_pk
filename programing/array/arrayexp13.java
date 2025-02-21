package array;

public class arrayexp13 
{
 public static void main(String[] args) {
     double[] values={5.8,5.7,5.3,4.9,5.8};
     double small = values[0];
     for(int i=0; i<values.length; i++)
     {
        if(values[i]<small)
        {
            small =values[i];
        }
     }
     System.out.println("smallest values : "+small);

 }   
}

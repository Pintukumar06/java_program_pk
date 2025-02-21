public class returnexp5
{
    static boolean  verify(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("status : "+verify(10));
        System.out.println("status : "+verify(15));
        System.out.println("status : "+verify(20));
        System.out.println("status : "+verify(23));
    }
}

package block;

public class nonstaticsblock {
    int a;
    {
        a=10;
    }
    public static void main(String[] args) {
        System.out.println("program starts");
        nonstaticsblock ref=new nonstaticsblock();
        System.out.println(ref.a);
        System.out.println("program ends");
    }
    
}

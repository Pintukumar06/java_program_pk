package block;
//differnt stages in which a non-statics data member can be initialization.
public class gamma {
    int n=15; //initialization during declaration before object creation 
    {
        n=25; //initialization during object creation 

    }
    public static void main(String[] args) {
        gamma ref=new gamma();
        ref.n=45; //initialization after object creation 
        System.out.println(ref.n);
    }
}

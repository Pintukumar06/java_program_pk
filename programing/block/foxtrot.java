package block;
//different stages in which a static data member can be initialization.
public class foxtrot {
    static int a=10; //initialization during declaration
    static 
    {
        a=20; //initialization during class loading

    }
    public static void main(String[] args) {
        foxtrot.a=30; //initialization after class loading
        System.out.println(foxtrot.a);
    }
}

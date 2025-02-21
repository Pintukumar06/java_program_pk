package classprogram;

class Pen{

    double price;
    String color;
    void writing()
    {
        System.out.println("Writing pen cost : "+price);

    }
    void drawing()
    {
        System.out.println("Drawing pen color "+color);
    }
}

public class penexp{
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.price=10.0;
        p1.color="Blue";
        p1.writing();

        Pen p2=new Pen();
        p2.price=15.0;
        p2.color="Black";
        p2.drawing();
        
        Pen p3=new Pen();
        p3.price=12.0;
        p3.color="Red";
        p3.drawing();


    }
    
}

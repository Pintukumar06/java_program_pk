package classprogram;


class Bike{
    String model;
    double milage;
    void riding()
    {
        System.out.println("Bike : "+model+" is riding");
    }
    void stopping()
    {
        System.out.println("Bike : "+milage+" is stopping");
    }
}

public class bikeprogram {
    public static void main(String[] args) {
        Bike b1=new Bike();
        b1.model="KTM";
        b1.milage=120.0;
        b1.riding();
        
        Bike b2=new Bike();
        b2.model="Royal";
        b2.milage=145.0;
        b2.stopping();
    }
    
}

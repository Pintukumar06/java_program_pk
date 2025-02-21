package classprogram;


class Profile{
    String name;
    int age;
    String gender;
    void update()
    {
        System.out.println("Profile : "+name+" is updating");
    }
    void remove()
    {
        System.out.println("Profile : "+age+" is removing");
    }
    void create()
    {
        System.out.println("Profile : "+gender+" is creating");
    }
}
public class profilepage {
    public static void main(String[] args) {
        Profile p1=new Profile();
        p1.name="Krishna";
        p1.age=35;
        p1.gender="Female";
        p1.update();

        Profile p2=new Profile();
        p2.name="Himanshu";
        p2.age=40;
        p2.gender="Male";
        p2.remove();

        Profile p3=new Profile();
        p3.name="Pintu";
        p3.age=24;
        p3.gender="Male";
        p3.create();
    }
    
}

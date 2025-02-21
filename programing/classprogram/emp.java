package classprogram;


class Employee{
    int id;
    double ctc;
    void work(){
        System.out.println("Employee : "+id+" is working");
    }
    void meeting(){
        System.out.println("Employee : "+ctc+" is meeting");
    }

}
public class emp {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.id=234;
        e1.ctc=5.6;
        e1.work();
        e1.meeting();
        
        Employee e2=new Employee();
        e2.id=456;
        e2.ctc=6.8;
        e2.work();
    }
    
}

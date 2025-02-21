package classprogram;


class Player{
    int id;
    double Highscore;
    void play()
    {
        System.out.println("Player : "+id+" is playing");
    }
    void exit()
    {
        System.out.println("player : "+Highscore+" is exiting");
    }
}

public class playerprogram {
    public static void main(String[] args) {
        Player p1=new Player();
        p1.id=101;
        p1.Highscore=120.0;
        p1.play();

        Player p2=new Player();
        p2.id=102;
        p2.Highscore=264.0;
        p2.exit();
    }
}

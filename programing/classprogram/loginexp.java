package classprogram;

class LoginPage{
    String username;
    String password;
    void login(){
        System.out.println("Login with : "+username+" and "+password);
    }
    void CreateAccount(){
        System.out.println("Redrect to Create Account Page");
    }
    void ForgetPassword(){
        System.out.println("Account Recovery Options for "+username);
    }
}


public class loginexp {
    public static void main(String[] args) {
        LoginPage lp1=new LoginPage();
        lp1.CreateAccount();

        LoginPage lp2=new LoginPage();
        lp2.username="Pintu";
        lp2.password="Pintu201";
        lp2.login();
        System.out.println("...........");
        LoginPage lp3=new LoginPage();
        lp3.username="Pintu";
        lp3.ForgetPassword();
    }
}

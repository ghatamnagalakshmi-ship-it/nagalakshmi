import java.util.*;
class Login{
    private String username;
    private String password;
    void setData(String un,String pass){
        username=un;
        password=pass;
    }
    public String getusername(){
        return username;
    }
    public String getpassword(){
        return password;
    }

}
public class Assexample2 {
    public static void main(String[]args){
        Login l= new Login();
        l.setData("Nagalakshmi","naga@gmail.com");
        System.out.println("the username is:"+l.getusername());
        System.out.println("the password of username is:"+l.getpassword());
    }
}

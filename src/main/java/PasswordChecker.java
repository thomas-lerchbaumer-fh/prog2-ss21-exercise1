import java.util.ArrayList;

public class PasswordChecker {

    String password;

    public PasswordChecker(String pw){
        this.password = pw;
    }

    public PasswordChecker(){}



    public boolean checkPw(String pw){



        return true;
    }

    public boolean checkLength(String pw) {
        int MIN = 8;
        int MAX = 25;
        return pw.length() > MIN && pw.length() < MAX;
    }




    public static void main(String[] args){
        System.out.println("hello world");

    }
}

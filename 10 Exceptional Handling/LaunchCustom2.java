import java.util.Scanner;

class UnderAgeException extends Exception{
    public UnderAgeException(String msg){
        super(msg);
    }
}

class OverAgeException extends Exception{
    public OverAgeException(String msg){
        super(msg);
    }
}

class Applicant{
    private int age;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Age..");
        age = sc.nextInt();
    }

    public void verify() throws UnderAgeException, OverAgeException{
        if(age >= 18 && age < 70){
            System.out.println("Proceed further with your Application");
        }else if(age < 18){
            throw new UnderAgeException("You're underAge Kiddoo");
        }else{
            throw new OverAgeException("You're too old for this, Sorry");
        }
    }
}

class RTO{
    public void initiate(){
        Applicant ap = new Applicant();
        try{
            ap.input();
            ap.verify();
        }
        catch(UnderAgeException | OverAgeException ex){
            System.out.println(ex.getMessage());
            try{
                ap.input();
                ap.verify();
            }
            catch(UnderAgeException | OverAgeException e){
                System.out.println(e.getMessage());
                try{
                    ap.input();
                    ap.verify();
                }
                catch(UnderAgeException | OverAgeException e1){
                    System.out.println(e1.getMessage());
                    System.out.println("Sorry, Try Again after some time");
                }
            }
        }
    }
}

public class LaunchCustom2 {
    public static void main(String[] args) {
        System.out.println("Application Started");
        RTO r = new RTO();
        r.initiate();
        System.out.println("Application Terminated");
    }   
}


public class NewSwitch {
    public static void main(String args[]){
        String day = "Monday";

        switch(day){

            case "Saturday", "Sunday" -> System.out.println("6Am");

            case "Monday" -> System.out.println("7Am");

            default -> System.out.println("lazyy");

        }
    }
}

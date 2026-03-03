interface Alien{
    int getStringLength(String name);
}

class AlienImpl implements Alien{
    public int getStringLength(String name){
        return name.length();
    }
}

public class LaunchLambda2 {
    public static void main(String[] args) {
        Alien al = (String name) -> { // Lambda
            return name.length();
        };
        System.out.println(al.getStringLength("Sami"));

        
        // FI f= name ->  name.length();
		
		// System.out.println(f.lengthOfWord("AbdulSamiLajwan"));

    }

}

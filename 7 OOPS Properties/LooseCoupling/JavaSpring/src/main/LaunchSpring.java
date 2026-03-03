package main;

import services.SystemDesign;

public class LaunchSpring {
    public static void main(String[] args) {
        Telusko t = new Telusko();
        t.setCourse(new SystemDesign());
        
        boolean status = t.buyTheCourse();
        if (status) {
            System.out.println("Successfully registered at telusko");
        } else {
            System.out.println("Not found");
        }
    }
}

// javac -d bin src/main/*.java src/services/*.java && java -cp bin main.LaunchSpring

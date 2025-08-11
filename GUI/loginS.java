import javax.swing.*;


//with parent class only/*
/*
 * public class loginS {
    public static void main(String[] args) {
        JFrame j1 = new JFrame("Login Screen Example");
        j1.setSize(900,500);
        j1.setVisible(true);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 */

// child class inherit from parent class

class loginS extends JFrame{
    loginS(String s1){
        super(s1);
    }
    loginS(){

    }
    void setComponents(){
        JLabel l1 = new JLabel("WELCOME");
        JTextField t1 = new JTextField();
        setLayout(null);

        l1.setBounds(200,100,100,30);
        t1.setBounds(200,200,100,30);
        add(l1);
        add(t1);

    }
    public static void main(String[] args) {
        loginS s1 = new loginS("Welcome to coding seekho");
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s1.setSize(900,900);
        s1.setComponents();
        s1.setVisible(true);

    }
}
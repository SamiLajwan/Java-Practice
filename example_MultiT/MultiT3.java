import java.util.Scanner;

class Account{
    int bal;
    Account(int b){
        bal = b;
    }
    public boolean isSufficient(int wb){
        if(bal >= wb){
            return true;
        }
        else{
            return false;
        }
    }

    public void withdraw(int wb){
        bal = bal-wb;
        System.out.println("Withdrawl Succesful. ");
        System.out.println("Current Bal is: " + bal);
    }
}

class Customer implements Runnable{
    Account h1;
    String name;
    Customer(Account g1, String s1){
        h1=g1;
        name=s1;
    }

    public void run(){
        synchronized(h1){
            Scanner S1 = new Scanner(System.in);
            System.out.println(name + " Enter Amount to Withdraw: ");
            int amt = S1.nextInt();
            if(h1.isSufficient(amt)){
                h1.withdraw(amt);
            }
            else{
                System.out.println("InSufficient Bal.");
            }
        }
    }
}


class MultiT3{
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer C1 = new Customer(a1,"Payal");
        Customer C2 = new Customer(a1,"Sam");
        Thread T1 = new Thread(C1);
        Thread T2 = new Thread(C2);
        T1.start();
        T2.start();
    }
}
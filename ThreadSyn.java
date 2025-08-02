import java.util.Scanner;

class Account{
    int bal;
    Account(int b){
        bal = b;
    }

   boolean isSufficientBal(int w){
        if(bal >= w){
            return true;
        }
        else{
            return false;
        }
   } 

   void withdraw(int amt, String g1){
        bal = bal - amt;
        System.out.println(g1 + "Transaction successful of ->  " + amt);
        System.out.println(g1 + "Current balance: " + bal);
   }
}

class Customer implements Runnable{
        Account x1;
        String m1;
        Customer(Account j1, String h1){
            x1 = j1;
            m1 = h1;
        }
        public void run(){
            try (Scanner s1 = new Scanner(System.in)) {
                synchronized(x1)
                {
                    System.out.println("Enter amount to Withdraw for " + m1 + ":");
                    int amt = s1.nextInt();
                    if(x1.isSufficientBal(amt)) 
                    {
                        x1.withdraw(amt,m1);
                    }
                    else{
                        System.out.println("Insuffeiceint Bal.");
                    }
                }
            }
        }
}

public class ThreadSyn {
    public static void main(String[] args) {
       
        Account a1 = new Account(5000);
            Customer c1 = new Customer(a1, "Amit");
            Customer c2 = new Customer(a1, "Sumit");
            Thread T1 = new Thread(c1);
            Thread T2  = new Thread(c2);
            T1.start();
            T2.start(); 
    }
}

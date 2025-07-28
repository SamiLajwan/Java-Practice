class Process1 implements Runnable {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("process1: " + i);
        }
    }
}

class Process2 implements Runnable {
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("process2: " + i);
        }
    }
}

class MultiT{
    public static void main(String[] args){
        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        Thread T1 = new Thread(p1);
        Thread T2 = new Thread(p2);
        T1.start();
        T2.start();
    }
}
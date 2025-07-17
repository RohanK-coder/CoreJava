package oops.multithreading;

public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        Thread one =  new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<4;i++){
                    System.out.println("Thread one : "+i);
                }
            }
        });
        Thread two =  new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i=0;i<4;i++){
                    System.out.println("Thread two : "+i);
                }
            }
        });

        System.out.println("Before executing threads");
        one.start();
        two.start();
        one.join();
        two.join();
        System.out.println("done executing the threads");
    }
}



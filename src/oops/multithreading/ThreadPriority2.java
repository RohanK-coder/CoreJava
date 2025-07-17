package oops.multithreading;

public class ThreadPriority2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+" says Hi");
        Thread one = new Thread(new Runnable(){
            @Override
            public void run(){
                System.out.println("Thread one says Hi as well");
            }
        });

        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
}

package oops.synchronization;

public class SynchronizationProblems {
    private static int counter1 = 0;
    private static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(()->{
            for(int i=0;i<10000;i++){
                increment1();
            }
        });
        Thread two = new Thread(()->{
            for(int i=0;i<10000;i++){
                increment2();
            }
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println("Counter value is : "+counter1+"--"+counter2);

    }


    //this method to be accessed my only one thread at any point of time
    synchronized private static void increment1(){
        counter1++;
    }

    synchronized private static void increment2(){
        counter2++;
    }
}

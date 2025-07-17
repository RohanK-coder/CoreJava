package oops.synchronization;

public class LockWIthCustomObjects {
    private static int counter3 = 0;
    private static int counter4 = 0;

    public static void main(String[] args) throws InterruptedException
    {
        Thread one = new Thread(()->{
            for(int i=0;i<10000;i++){
                increment3();
            }
        });
        Thread two = new Thread(()->{
            for(int i=0;i<10000;i++){
                increment4();
            }
        });

        one.start();
        two.start();

            try {
                one.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                two.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        System.out.println(counter3+"--"+counter4);
    }

    private static  void increment3(){
            counter3++;
        }

        private static  void increment4(){
            counter4++;
    }

}

package oops.multithreading;

public class DaemonUserThread {
    public static void main(String[] args) {
        Thread bgTHread = new Thread(new DaemonHelper());
        Thread userThread = new Thread(new UserThreadHelper());

        //set to daemon
        bgTHread.setDaemon(true);
        bgTHread.start();
        userThread.start();
    }
}

    class DaemonHelper implements Runnable{
        @Override
        public void run(){
            int count=0;
            while(count<500){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
                System.out.println("Daemon Helper running");
            }

        }

    }

    class UserThreadHelper implements Runnable{
        @Override
        public void run()
        {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("user thread done with execution");
        }
    }


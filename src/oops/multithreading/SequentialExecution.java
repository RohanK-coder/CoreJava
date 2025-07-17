package oops.multithreading;

public class SequentialExecution {
    public static void main(String[] args) {
        demo1();
        demo2();
    }
    static void demo1(){
        System.out.println("Demo 1");
    }
    static void demo2(){
        System.out.println("Demo 2");
    }
}

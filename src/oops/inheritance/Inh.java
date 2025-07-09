package oops.inheritance;

public class Inh extends Calculator {
    public static void main(String[] args) {
        Inh in = new Inh();
        System.out.println(add(1,2));
        System.out.println(Calculator.multiply(2,3));
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}



package oops.inheritance;

public class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int substract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        System.out.println("Parent Multiplication");
        return a*b;
    }
}
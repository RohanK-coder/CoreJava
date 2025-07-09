package oops;

public class Constructor {

    Constructor(){
        System.out.println("Invoking the constructor");
    }

    Constructor(int a){
        System.out.println("The value is "+a);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        Constructor a = new Constructor(2);
    }
}

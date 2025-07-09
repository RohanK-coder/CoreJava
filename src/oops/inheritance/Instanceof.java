package oops.inheritance;

interface Mammal{}
class Dog implements Mammal{}

public class Instanceof {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println(d instanceof Mammal);
    }
}

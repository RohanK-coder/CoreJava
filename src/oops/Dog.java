package oops;

public class Dog {
    public String name;
    int age;
    String color;



    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Tommy",12,"red");
        System.out.println(dog);

    }


}


package com.tutorialspoint;

class Address {
    int strNum;
    String city;
    String state;
    String country;

    Address(int street, String c, String st, String country) {
        this.strNum = street;
        this.city = c;
        this.state = st;
        this.country = country;
    }
}
class Student {
    int rno;
    String stName;

    Address stAddr;
    Student(int roll, String name, Address address){
        this.rno = roll;
        this.stName = name;
        this.stAddr = address;
    }
}

public class Aggregation {

    public static void main(String[] args) {
        Address ad= new Address(10, "Bareilly", "UP", "India");
        Student st= new Student(1, "Aashi", ad);
        System.out.println("Roll no: "+ st.rno);
        System.out.println("Name: "+ st.stName);
        System.out.println("Street: "+ st.stAddr.strNum);
        System.out.println("City: "+ st.stAddr.city);
        System.out.println("State: "+ st.stAddr.state);
        System.out.println("Country: "+ st.stAddr.country);
    }
}
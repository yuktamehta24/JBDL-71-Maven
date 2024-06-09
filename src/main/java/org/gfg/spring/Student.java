package org.gfg.spring;

public class Student {

    String name;
    int rollNo;
    Address address;


    public Student(String name, int rollNo, Address address) {
        System.out.println("In parameterized constructor");
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public Student() {
        System.out.println("In constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void abc() {
        System.out.println("In abc method with name: "+ name);
    }

    public void def() {
        System.out.println("In def method with name: "+ name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", address=" + address +
                '}';
    }
}

package org.gfg.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        Address address = new Address();
        address.city = "Delhi";
        address.pincode = "110018";

//        Student student = new Student("Yukta", 1, address); //injection
//        System.out.println("created myself: "+ student);

        // Address is 1 dependency of Student
        // We are doing dependency injection

        // When spring is doing dependency injection on our behalf,
        // Inversion of control is happening.

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("factoryBean.xml");

        Student student1 = (Student) applicationContext.getBean("student");
        System.out.println(student1); // same

        applicationContext.close();

//        Student student2 = (Student) applicationContext.getBean("student");
//        System.out.println(student2);
    }
}

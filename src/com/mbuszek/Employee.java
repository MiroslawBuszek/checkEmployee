package com.mbuszek;

public class Employee {

    private String firstName;
    private String secondName;
    private String emailAddress;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String firstName, String secondName, String emailAdress, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.emailAddress = emailAdress;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void generalInfo() {
        System.out.println(
                        "Full name: " + firstName + " " + secondName + "\n" +
                        "Age: " + age + "\n" +
                        "Email: " + emailAddress + "\n" +
                        "Phone: " + phoneNumber + "\n" +
                        "Salary: " + salary);
    }
}

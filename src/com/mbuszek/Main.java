package com.mbuszek;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("John", "Kilbo", "kilbo.j@gmail.com", "777555888", 5000, 30);
        employees[1] = new Employee("Milo", "Santler", "milo.s@gmail.com", "666888999", 4000, 25);
        employees[2] = new Employee("Frank", "Owl", "frank.o@gmail.com", "555444888", 7500, 37);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 35) {
                employees[i].generalInfo();
            }
        }
    }
}


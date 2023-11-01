package org.example;
public class Manager extends Employee {

    public Manager(String name, double salary, int age) {
        super(name, salary, age);
    }
    public static void increaseSalary(Employee[] employees, double amount) {
        for (Employee employee : employees
        ) {
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(amount);
            }
        }
    }
}

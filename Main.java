/*
Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
без использования условного оператора.
Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя,
модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась
*/
package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", 3000, 35));
        employees.add(new Manager("Jane Smith", 5000, 40));
        employees.add(new Employee("Mark Johnson", 4000, 45));

        System.out.println("Before salary increase:");
        for (Employee employee : employees
        ) {
            System.out.println(employee);
        }

        Manager.increaseSalary(employees.toArray(new Employee[0]), 1000);
        System.out.println("\nAfter salary increase:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Сортировка списка сотрудников по зарплате
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nAfter sorting by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        // Сортировка списка сотрудников по возрасту
        Collections.sort(employees, new AgeComparator());

        System.out.println("\nAfter sorting by age:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
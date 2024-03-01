package ru.gb.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Freelancer(100, "Иван", 25));
        employees.add(new Freelancer(110, "Егор", 28));
        employees.add(new Freelancer(101, "Илья", 20));
        employees.add(new Freelancer(90, "Лука", 33));
        employees.add(new Freelancer(200, "Глеб", 18));
        employees.add(new Worker(18000, "Игорь", 19));
        employees.add(new Worker(20000, "Антон",45));
        employees.add(new Worker(15000, "Захар",35));
        employees.add(new Worker(25600, "Денис", 24));
        employees.add(new Worker(24000, "Артур",53));
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println();

        Comparator<Employee> byAge = Comparator.comparing(Employee::getAge);       // сортировка по возрасту
        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary); // сортировка по зарплате
        System.out.println();
        System.out.println("""

                Сортировка по возрастанию возраста (Comparator):
                """);
        employees.sort(byAge);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("""

                Сортировка по возрастанию зарплаты (Comparator):
                """);
        employees.sort(bySalary);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("""

                Сортировка по дате трудоустройства (Comparable)
                """);
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}

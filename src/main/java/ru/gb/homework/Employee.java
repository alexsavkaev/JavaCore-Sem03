package ru.gb.homework;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Employee implements Comparable<Employee> {
    String name;
    int age;
    protected int monthlyWage;
    protected int hourlyWage;
    protected LocalDate hiredDate;

    public int getMonthlyWage() {
        return monthlyWage;
    }

    public void setMonthlyWage(int monthlyWage) {
        this.monthlyWage = monthlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public double getSalary() {
        return 0;
    }

    /**
     * Генератор случайных дат
     * @return случайная дата от 1.1.1970, до сегодняшнего дня
     */
    private LocalDate getRandomDate() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    public Employee() {
        this(0, 0, "Emplyee", 18);
    }
    public Employee(int monthlyWage, int hourlyWage, String name, int age) {
        this.monthlyWage = monthlyWage;
        this.hourlyWage = hourlyWage;
        this.name = name;
        this.age = age;
        this.hiredDate = getRandomDate();
    }
    @Override
    public int compareTo(Employee o) {
        return this.hiredDate.compareTo(o.hiredDate);
    }

@Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "Имя='" + name + '\'' +
                ", Возраст=" + age + '}'+
                ", Зарплата=" + getSalary() +
                ", Трудоустроен " + hiredDate +
                '}';
    }


}

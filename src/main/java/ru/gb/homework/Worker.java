package ru.gb.homework;

public class Worker extends Employee {
    @Override
    public double getSalary() {
        return super.getMonthlyWage();

}
    public Worker(int monthlyWage, String name, int age) {
        super(monthlyWage, 0, name, age);
    }
}
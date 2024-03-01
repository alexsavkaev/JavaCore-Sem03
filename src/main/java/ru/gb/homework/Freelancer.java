package ru.gb.homework;

public class Freelancer extends Employee {
    @Override
    public double getSalary (){
        return  20.8 * 8 * hourlyWage;
    }
public Freelancer (int hourlyWage, String name, int age) {
    super(0,hourlyWage, name, age);
}



}

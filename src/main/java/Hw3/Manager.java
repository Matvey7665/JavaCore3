package Hw3;

import java.util.List;

public class Manager extends Employee {
    public Manager(String name, String midName, String surName, int salary, int birthday, int bDay, int bMonth) {
        super(name, midName, surName, salary, birthday, bDay, bMonth);
    }

    public static void upSalary(int value, List<Employee> employees){
        for (Employee employee : employees){
            if (!(employee instanceof Manager)){
                employee.raiseSalary(value);
            }
        }

    }

}

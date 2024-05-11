package Hw3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee  {
    String name;
    String midName;
    String surName;
    int salary;
    int birthday;
    int bDay;
    int bMonth;

    public Employee(String name, String midName, String surName, int salary, int birthday, int bDay, int bMonth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.salary = salary;
        this.birthday = birthday;
        this.bDay = bDay;
        this.bMonth = bMonth;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public int getAge(){
        return LocalDate.now().getYear() - birthday;
    }

    public void raiseSalary(int value) {
        salary += value;
    }
    public int compareTo(int dd, int mm, int yyyy) {
        int empl = bDay + (bMonth<<6) + (birthday<<11);
        int income = dd + (mm<<6) + (yyyy<<11);
        return empl - income;
    }
}

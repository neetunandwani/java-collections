package com.ttn.collections;

import java.util.Comparator;

//we can create as much comparator as we want according to our use case, but camparable we can only implement compareTo once
public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getAge() - t1.getAge();
    }
}

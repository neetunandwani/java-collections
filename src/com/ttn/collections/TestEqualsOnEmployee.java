package com.ttn.collections;

import java.util.HashSet;

public class TestEqualsOnEmployee {

    public void test(){
        HashSet<Employee> empHashSet=new HashSet<>();
        Employee David = new Employee("David", 32);
        Employee John = new Employee("John", 45);
        empHashSet.add(David);
        empHashSet.add(John);
        empHashSet.forEach(System.out::println);
        Employee DavidForRemoval=new Employee("David", 32);
        System.out.println("----David's Objects are equal? "+David.equals(DavidForRemoval));
        boolean isRemoved=empHashSet.remove(DavidForRemoval);
        System.out.println("David is removed: "+isRemoved);
        empHashSet.forEach(System.out::println);
        System.out.println("----David's hashcode: "+David.hashCode());
        System.out.println("----John's hashcode: "+John.hashCode());
        System.out.println("----DavidForRemoval's hashcode: "+DavidForRemoval.hashCode());
    }
}

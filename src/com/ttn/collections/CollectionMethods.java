package com.ttn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionMethods {

    public void testComparator() {
        List<Employee> people = new ArrayList<>();
        people.add(new Employee("a", 12));
        people.add(new Employee("b", 33));
        people.add(new Employee("c", 4));
        people.add(new Employee("d", 15));
        people.add(new Employee("e", 60));
        people.forEach(System.out::println);
        System.out.println();
        people.sort(new EmployeeComparator());
        people.forEach(System.out::println);
    }

    public void testComparable() {
        List<Person> people = new ArrayList<>();
        people.add(new Person(12));
        people.add(new Person(33));
        people.add(new Person(4));
        people.add(new Person(15));
        people.add(new Person(60));
        people.forEach(System.out::println);
        System.out.println();
        Collections.sort(people);
        people.forEach(System.out::println);
    }


    public void testWithIterator() {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(2));
        people.add(new Person(3));
        people.add(new Person(4));
        people.add(new Person(5));
        people.add(new Person(6));
        Iterator iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void test() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(4));
        persons.add(new Person(5));

        System.out.println("persons");
        persons.forEach(System.out::println);
        System.out.println("Size:" + persons.size());
        System.out.println();

        ArrayList<Person> newList = new ArrayList<>();
        newList.add(new Person(6));
        newList.add(new Person(7));
        newList.addAll(persons);
        System.out.println("new List");
        newList.forEach(System.out::println);
        System.out.println("Size:" + newList.size());
        System.out.println();

        System.out.println("To Array[]");
        Person[] personArr = new Person[newList.size()];
        newList.toArray(personArr);
        for (Person p : personArr) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("To Array");
        Object[] objectArr = newList.toArray();
        for (Object p : objectArr) {
            System.out.println((Person) p);
        }
        System.out.println();

        System.out.println("contains: " + newList.contains(new Person(5)));
        System.out.println("containsAll: " + newList.containsAll(persons));
        System.out.println();

        System.out.println("retain all");
        newList.retainAll(persons);
        newList.forEach(System.out::println);
        System.out.println();

        System.out.println("Remove");
        System.out.println(newList.remove(new Person(5)));
        newList.forEach(System.out::println);
        System.out.println();

        System.out.println("Remove all");
        newList.removeAll(persons);
        newList.forEach(System.out::println);
        System.out.println();

        persons.clear();
        persons.forEach(System.out::println);
        System.out.println();

        System.out.println("isEmpty persons: " + persons.isEmpty());
        System.out.println("isEmpty newList: " + newList.isEmpty());
    }
}

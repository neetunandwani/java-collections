package com.ttn.collections;

public class Test<T> {
    T obj;
    public Test(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}

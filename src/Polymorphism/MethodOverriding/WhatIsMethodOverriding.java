package Polymorphism.MethodOverriding;

class Parent{
    int addition(int a, int b){
        return a + b ;
    }

    void test(){
        System.out.println("Parent class method");
    }
}

class ParentChild extends Parent {
    @Override
    int addition(int a, int b) {
        return a + b  + 220 + 3000;
    }
}

public class WhatIsMethodOverriding extends Parent{

    @Override
    int addition(int a, int b) {
        return a + b  + 100 + 200;
    }
}

package com.decorator;

public class ConcreteComponent implements IComponent{

    @Override
    public void operation() {
        System.out.println("Base operation");
    }
}

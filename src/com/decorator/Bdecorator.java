package com.decorator;

public class Bdecorator extends ComponentDecorator{

    public Bdecorator(IComponent cmp) {
        super(cmp);
    }

    public void operation(){
        extendedComponent.operation();
        addB();
    }

    public void addB(){
        System.out.print(" +B\n");
    }
}


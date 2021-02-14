package com.decorator;

public class Adecorator extends ComponentDecorator{


    public Adecorator(IComponent cmp) {
        super(cmp);
    }

    public void operation(){
      extendedComponent.operation();
      addA();
    }

    public void addA(){
        System.out.print(" +A\n");
    }
}

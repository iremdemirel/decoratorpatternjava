package com.decorator;

public class Main {

    public static void main(String[] args) {

        IComponent cp = new Adecorator( new Bdecorator(new Adecorator(new ConcreteComponent())));


        cp.operation();

        /*     --output---
        *
        *      Base operation
        *      +A
        *      +B
        *      +A
        * */

    }
}

package com.decorator;

abstract class ComponentDecorator implements IComponent{

    protected IComponent extendedComponent;

    public ComponentDecorator(IComponent extendedComponent){
        this.extendedComponent = extendedComponent;
    }

    @Override
    public void operation() {
        extendedComponent.operation();
    }
}

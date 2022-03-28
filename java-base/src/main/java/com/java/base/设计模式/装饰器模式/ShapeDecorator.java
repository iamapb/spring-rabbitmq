package com.java.base.设计模式.装饰器模式;

public abstract class ShapeDecorator implements Shape {


    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    protected Shape decoratorShape;

    public void draw() {
        decoratorShape.draw();
    }


}

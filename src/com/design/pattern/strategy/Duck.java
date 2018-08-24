package com.design.pattern.strategy;

public class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("duck is swimming");
    }

    public void display(){
        System.out.println("display");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

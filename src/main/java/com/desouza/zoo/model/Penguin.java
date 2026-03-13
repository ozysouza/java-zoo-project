package main.java.com.desouza.zoo.model;

import main.java.com.desouza.zoo.behavior.Swim;
import main.java.com.desouza.zoo.behavior.Walk;

public class Penguin extends Animal implements Walk, Swim {

    private boolean isSwimming;
    private double walkSpeed;
    private double swimSpeed;

    public Penguin() {
        super("Penguin");
        isSwimming = false;
    }

    public boolean getIsSwimming() {
        return isSwimming;
    }

    public void setIsSwimming(boolean isSwimming) {
        this.isSwimming = isSwimming;
    }

    public double getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(double walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }

    @Override
    public void swimming() {
        System.out.println("Penguin: I am swimming at the speed of " + swimSpeed + " nautical miles per hour");
    }

    @Override
    public void walking() {
        System.out.println("Penguin: I am walking at the speed " + walkSpeed + " mph.");
    }
}

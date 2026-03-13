package main.java.com.desouza.zoo.model;

import main.java.com.desouza.zoo.behavior.Swim;

public class Dolphin extends Animal implements Swim {

    private String colorOfDolphin;
    private double swimmingSpeed;

    public Dolphin() {
        super("Dolphin");
    }

    public String getColorOfDolphin() {
        return colorOfDolphin;
    }

    public void setColorOfDolphin(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }

    public Double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(Double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }

    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}

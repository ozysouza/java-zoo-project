package main.java.com.desouza.zoo.model;

public class Dolphin extends Animal {

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
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat.");
    }
}

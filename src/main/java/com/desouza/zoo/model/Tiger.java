package main.java.com.desouza.zoo.model;

public class Tiger extends Animal {

    private int numberOfStripes;
    private double speed;
    private double soundLevelOfRoar;

    public Tiger() {
        super("Tiger");

    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSoundLevelOfRoar() {
        return soundLevelOfRoar;
    }

    public void setSoundLevelOfRoar(double soundLevelOfRoar) {
        this.soundLevelOfRoar = soundLevelOfRoar;
    }

    @Override
    public void eatingCompleted() {

    }
}

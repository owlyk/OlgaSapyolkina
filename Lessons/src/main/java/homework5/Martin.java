package homework5;

import javax.swing.*;

public class Martin extends Birds implements CanFly, CanEat {


    private String beak;

    public Martin(String name, String type, String beak) {
        super(name, type);
        this.beak = beak;
    }

    @Override
    public Double speed(CanFly canFly) {
        return null;
    }


    @Override
    public void canEat() {

    }

    @Override
    public void canMove() {

    }

    @Override
    public double speed() {
        return 0;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }
}

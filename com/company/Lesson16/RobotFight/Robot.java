package com.company.Lesson16.RobotFight;

/**
 * Created by Toll on 03.08.2017.
 */
public class Robot extends AbstractRobot {


    public Robot(String name, double experiance) {
        super(name, 100, experiance);
    }


    @Override
    public void restoreLife() {
        this.lifeStatus = 100;
    }

    @Override
    public boolean selfTest() {
        if (this.lifeStatus < 1) return false;
        else return true;
    }

    @Override
    public void endOfRound() {
        if (this.selfTest()) {
            this.pointsCount++;
            System.out.println("*** " + this.getName() + " vin 1 point ***");
        }
    }
}

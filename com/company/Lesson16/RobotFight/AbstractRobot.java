package com.company.Lesson16.RobotFight;

/**
 * Created by Toll on 03.08.2017.
 */
public abstract class AbstractRobot implements Attackable, Defensable {
    static {

    }

    private String name;
    private static int hitCount;
    private static final double k=0.9;

    int lifeStatus;
    Integer pointsCount;
    double experience;


    public AbstractRobot(String name, int lifeStatus, double experience) {
        this.name = name;
        this.lifeStatus = lifeStatus;
        this.experience = experience;
        this.pointsCount = 0;
    }

    public String getName() {
        return this.name;
    }

    public void lowerLife() {
        if (hitCount == 3) {
            this.lifeStatus -= new Long(Math.round(50 * this.experience)).intValue();
            this.experience= this.experience*k;
        } else {
            if (hitCount == 4) {
                this.lifeStatus -= new Long(Math.round(30 * this.experience)).intValue();
                this.experience= this.experience*k;
            } else {
                this.lifeStatus -= new Long(Math.round(20 * this.experience)).intValue();
                this.experience= this.experience*k;

            }
        }
    }

    public abstract void restoreLife();

    public abstract boolean selfTest();

    public abstract void endOfRound();


    @Override
    public BodyPart attack() {
        hitCount = (int) (Math.random() * 4 + 1);
        if (hitCount == 1) return BodyPart.LEG;
        else if (hitCount == 2) return BodyPart.HAND;
        else if (hitCount == 3) return BodyPart.HEAD;
        else if (hitCount == 4) return BodyPart.CHEST;
        else return null;
    }

    @Override
    public BodyPart defense() {
        hitCount = (int) (Math.random() * 4 + 1);
        if (hitCount == 1) return BodyPart.LEG;
        else if (hitCount == 2) return BodyPart.HAND;
        else if (hitCount == 3) return BodyPart.HEAD;
        else if (hitCount == 4) return BodyPart.CHEST;
        else return null;
    }
}

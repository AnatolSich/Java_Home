package com.company.Lesson16.RobotFight;

import java.util.Comparator;

/**
 * Created by Toll on 09.08.2017.
 */
public class RobotsComparator implements Comparator<AbstractRobot> {

    @Override
    public int compare(AbstractRobot r1, AbstractRobot r2) {
        if (r1.pointsCount > r2.pointsCount) return -1;
        else if (r1.pointsCount == r2.pointsCount) return 0;
        else return 1;
    }
}

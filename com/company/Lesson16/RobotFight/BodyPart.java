package com.company.Lesson16.RobotFight;

/**
 * Created by Toll on 03.08.2017.
 */
public class BodyPart {
    static final BodyPart LEG = new BodyPart("Нога");
    static final BodyPart HAND =  new BodyPart("Рука");
    static final BodyPart HEAD =  new BodyPart("Голова");
    static final BodyPart CHEST =  new BodyPart("Грудь");

    String bodyPart;

    public BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }
}

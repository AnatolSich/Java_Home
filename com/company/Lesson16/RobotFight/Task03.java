package com.company.Lesson16.RobotFight;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Toll on 03.08.2017.
 */

/* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/

public class Task03 {

    public static void main(String[] args) {
        AbstractRobot robot1 = new Robot("robot1", 1);
        AbstractRobot robot2 = new Robot("robot2", 1);
        AbstractRobot robot3 = new Robot("robot3",1);
        AbstractRobot robot4 = new Robot("robot4",1);


        List <AbstractRobot> turnirList = new ArrayList();
        turnirList.add(robot1);
        turnirList.add(robot2);
        turnirList.add(robot3);
        turnirList.add(robot4);

        printing(turnirList);

        for (int i = 0; i < turnirList.size()-1; i++) {
            for (int j = i+1; j < turnirList.size(); j++) {
                AbstractRobot tempRobot1 = turnirList.get(i);
                AbstractRobot tempRobot2 = turnirList.get(j);
                while (tempRobot1.selfTest()&&tempRobot2.selfTest()){
                    doMove(tempRobot1,tempRobot2);
                }
                tempRobot1.endOfRound();
                tempRobot2.endOfRound();
                System.out.println("***************************");
                tempRobot1.restoreLife();
                tempRobot2.restoreLife();
            }

        }

        printing(turnirList);

        if(turnirList.get(0).pointsCount==turnirList.get(1).pointsCount) {
            System.out.println("********ExtraRound********");



            AbstractRobot tempRobot1 = turnirList.get(0);
            AbstractRobot tempRobot2 = turnirList.get(1);
            while (tempRobot1.selfTest()&&tempRobot2.selfTest()){
                doMove(tempRobot1,tempRobot2);
            }
            tempRobot1.endOfRound();
            tempRobot2.endOfRound();
            System.out.println("***************************");
            tempRobot1.restoreLife();
            tempRobot2.restoreLife();
            printing(turnirList);
        }

    }

    static void printing(List <AbstractRobot> turnirList){
        turnirList.sort(new RobotsComparator());
        for (AbstractRobot robot:turnirList
             ) {
            System.out.println(robot.getName()+" - "+robot.pointsCount);
        }
    }


    static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        String name1 = robotFirst.getName();
        String name2 = robotSecond.getName();
        String partAtack1 = robotFirst.attack().bodyPart;
        String partDef1 = robotSecond.attack().bodyPart;
        if (partAtack1.equals(partDef1))
            System.out.printf("%s %s атаковал робота %s %s, атакована %s, защищена %s, поставлен блок \n", name1, robotFirst.lifeStatus, name2, robotSecond.lifeStatus, partAtack1, partDef1);
        else{
            robotSecond.lowerLife();
            System.out.printf("%s %s атаковал робота %s %s, атакована %s, защищена %s, нанесен урон \n", name1, robotFirst.lifeStatus, name2, robotSecond.lifeStatus, partAtack1, partDef1);
        }
         String partAtack2 = robotSecond.attack().bodyPart;
        String partDef2 = robotFirst.attack().bodyPart;
        if (partAtack2.equals(partDef2))
            System.out.printf("%s %s атаковал робота %s %s, атакована %s, защищена %s, поставлен блок \n", name2, robotSecond.lifeStatus, name1, robotFirst.lifeStatus, partAtack2, partDef2);
        else{
            robotFirst.lowerLife();
            System.out.printf("%s %s атаковал робота %s %s, атакована %s, защищена %s, нанесен урон \n", name2, robotSecond.lifeStatus, name1, robotFirst.lifeStatus, partAtack2, partDef2);
        }

    }


}

package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount;
    public abstract Object getName();

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        AbstractRobot.hitCount = AbstractRobot.hitCount + 1;

        if (AbstractRobot.hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        }else if (AbstractRobot.hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (AbstractRobot.hitCount == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else {
            AbstractRobot.hitCount = 0;
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        AbstractRobot.hitCount = AbstractRobot.hitCount + 2;

        if (AbstractRobot.hitCount == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (AbstractRobot.hitCount == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (AbstractRobot.hitCount == 3) {
            defendedBodyPart = BodyPart.CHEST;
        } else {
            AbstractRobot.hitCount = 0;
            defendedBodyPart = BodyPart.ARM;
        }
        return defendedBodyPart;
    }

    public static int getHitCount() {
        return hitCount;
    }
}



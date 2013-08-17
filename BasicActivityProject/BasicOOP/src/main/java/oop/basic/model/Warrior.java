package oop.basic.model;

import oop.basic.R;

/**
 * Created by USER on 9/8/2556.
 */
public class Warrior extends BaseClass {
    public static final int CLASS_ID = 1;
    public static int createdTimes = 0;

    public Warrior() {
        super("Warrior");
        createdTimes++;
    }

    @Override
    protected int getStrength(int lvl) {
        int bonusA = lvl / 5;
        int bonusB = lvl / 10;
        int bonusC = lvl / 20;
        return lvl * 2 + bonusA * 2 + bonusB * 3 + bonusC * 5;
    }

    @Override
    protected int getAgility(int lvl) {
        int bonusA = lvl / 3;
        return lvl + bonusA;
    }

    @Override
    protected int getIntelligent(int lvl) {
        int bonusA = lvl / 5;
        return lvl / 2 + bonusA;
    }

    @Override
    final protected int getClassID() {
        return CLASS_ID;
    }

    @Override
    final protected int getClassPicture() {
        return R.drawable.warrior;
    }

    @Override
    public int getAllClassCreatedTimes() {
        return super.createdTimes;
    }

    @Override
    public int getClassCreatedTimes() {
        return Warrior.createdTimes;
    }
}

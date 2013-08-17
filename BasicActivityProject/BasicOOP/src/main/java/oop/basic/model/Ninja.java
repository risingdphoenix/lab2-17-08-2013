package oop.basic.model;

import oop.basic.R;

/**
 * Created by USER on 9/8/2556.
 */
public class Ninja extends BaseClass {
    public static final int CLASS_ID = 2;
    public static int createdTimes = 0;

    public Ninja() {
        super("Ninja");
        createdTimes++;
    }

    @Override
    protected int getStrength(int lvl) {
        int bonusA = lvl / 3;
        return lvl + bonusA;
    }

    @Override
    protected int getAgility(int lvl) {
        int bonusA = lvl / 5;
        int bonusB = lvl / 10;
        int bonusC = lvl / 20;
        return lvl * 2 + bonusA * 2 + bonusB * 3 + bonusC * 5;
    }

    @Override
    protected int getIntelligent(int lvl) {
        int bonusA = lvl / 3;
        return lvl + bonusA;
    }

    @Override
    final protected int getClassID() {
        return CLASS_ID;
    }

    @Override
    final protected int getClassPicture() {
        return R.drawable.ninja;
    }

    @Override
    public int getAllClassCreatedTimes() {
        return super.createdTimes;
    }

    @Override
    public int getClassCreatedTimes() {
        return this.createdTimes;
    }
}

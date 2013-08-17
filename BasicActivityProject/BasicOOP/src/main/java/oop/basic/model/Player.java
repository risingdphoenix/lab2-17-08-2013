package oop.basic.model;

/**
 * Created by USER on 9/8/2556.
 */
public class Player {
    private String mName;
    private int mLevel;
    private BaseClass mClass;
    private int[] mSkillsLevel;

    public Player(String name) {
        mName = name;
        mLevel = 1;
        mClass = new Novice();
        // reset createdTimes to initial value
        BaseClass.createdTimes = 0;
        Novice.createdTimes = 0;
    }

    final public int getStrength() {
        return mClass.getStrength(mLevel);
    }

    final public int getAgility() {
        return mClass.getAgility(mLevel);
    }

    final public int getIntelligent() {
        return mClass.getIntelligent(mLevel);
    }

    final public String getClassName() {
        return mClass.getClassName();
    }

    final public int getClassPicture() {
        return mClass.getClassPicture();
    }

    final public String getName() {
        return mName;
    }

    final public int getLevel() {
        return mLevel;
    }

    final public String getStatistic() {
        return "You have changed to " + mClass.getClassName() + " " + mClass.getClassCreatedTimes() + " times\nand changed class " + mClass.getAllClassCreatedTimes() + " times in overall.";
    }

    final public void lvlUp() {
        if(mLevel < 100)
            mLevel++;
    }

    final public void reset() {
        mLevel = 1;
    }

    final public void changeClass(int classID) {
        switch (classID) {
            case Warrior.CLASS_ID:
                mClass = new Warrior();
                break;
            case Ninja.CLASS_ID:
                mClass = new Ninja();
                break;
            case Wizard.CLASS_ID:
                mClass = new Wizard();
                break;
            default:
            case Novice.CLASS_ID:
                mClass = new Novice();
                break;
        }
    }
}

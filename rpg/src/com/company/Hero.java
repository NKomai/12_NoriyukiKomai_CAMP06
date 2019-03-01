package com.company;

public class Hero {
    public String name;
    public int HP;
    public int MP;
    public int ATK;
    public int DEF;
    public int mATK;
    public int mDEF;

public Hero(int point,String str) {
    if (point % 4 == 0) {
        name = str;
        HP = 100;
        MP = 100;
        ATK = 15;
        DEF = 25;
        mATK = 30;
        mDEF = 30;
    } else if (point % 4 == 1) {
        name = str;
        HP = 130;
        MP = 70;
        ATK = 25;
        DEF = 25;
        mATK = 25;
        mDEF = 25;
    } else if (point % 4 == 2) {
        name = str;
        HP = 150;
        MP = 50;
        ATK = 30;
        DEF = 30;
        mATK = 15;
        mDEF = 25;
    } else if (point % 4 == 3) {
        name = str;
        HP = 175;
        MP = 25;
        ATK = 40;
        DEF = 40;
        mATK = 10;
        mDEF = 10;
    }
}


}

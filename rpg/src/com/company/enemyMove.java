package com.company;

import java.util.Random;

public class enemyMove {
    public static void main(String name,int[] status,int[] enemy){
        System.out.println("りゅうおう　の　こうげき！");

        Random random = new Random();
        int action = random.nextInt(10);
        int damageR = random.nextInt(5);
        boolean damageM = random.nextBoolean();

        switch (action%3) {

            case 0:
                if (damageM == false) {
                    int damage = enemy[1] - damageR;
                    status[0] = status[0] - damage;
                    System.out.println(name + "　に" + damage + "のダメージ！");
                } else {
                    int damage = enemy[1] + damageR;
                    status[0] = status[0] - damage;
                    System.out.println(name + "　に" + damage + "のダメージ！");
                }
            break;

            case 1:
                System.out.println("りゅうおう　は　ぼーっと　している！");
            break;

            case 2:
                if (damageM == false) {
                    int damage = enemy[2] - damageR;
                    status[0] = status[0] - damage;
                    System.out.println("りゅうおう　は　もえさかるかえん　を　はいた！");
                    System.out.println(name + "　に" + damage + "のダメージ！");
                } else {
                    int damage = enemy[2] + damageR;
                    status[0] = status[0] - damage;
                    System.out.println("りゅうおう　は　もえさかるかえん　を　はいた！");
                    System.out.println(name + "　に" + damage + "のダメージ！");
                }
            break;
        }
    }
}

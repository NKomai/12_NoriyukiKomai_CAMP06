package com.company;
import java.util.Random;

public class magicattack {
        public static void main(String name,int[] status,int[] enemy){

            Random random = new Random();
            int damageR = random.nextInt(10);
            boolean damageM = random.nextBoolean();

            if(damageM == false){
                int damage = status[4] - damageR;
                System.out.println(name + "はじゅもんをとなえた！");
                enemy[0] = enemy[0] - damage;
                System.out.println("りゅうおう　に" + damage + "のダメージ！");
            }else{
                int damage = status[4] + damageR;
                System.out.println(name + "はじゅもんをとなえた！");
                enemy[0] = enemy[0] - damage;
                System.out.println("りゅうおう　に" + damage + "のダメージ！");
            }


        }
}

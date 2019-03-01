package com.company;
import java.util.Random;

public class magicheal {
        public static void main(String name,int[] status,int[] enemy){

            System.out.println("しかし　たいりょく　は　まんたんだ！");

            Random random = new Random();
            int healR = random.nextInt(3);
            boolean healM = random.nextBoolean();

            if(healM == false){
                int heal = status[4] - healR;
                System.out.println(name + "はかいふくじゅもんをとなえた！");
                status[0] = status[0] + heal;
                System.out.println(name + "の　たいりょく　が" + heal + "かいふく　した！");
            }else{
                int heal = status[4] + healR;
                System.out.println(name + "はかいふくじゅもんをとなえた！");
                status[0] = status[0] + heal;
                System.out.println(name + "の　たいりょく　が" + heal + "かいふく　した！");
            }


        }
}

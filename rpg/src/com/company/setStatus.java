package com.company;

public class setStatus {
    public static int[] main(int point){

        //ステータスの並びは{HP,MP.ATK,DEF,M-ATK,M-DEF}
        //質問で得た点数を４で割ったあまりに応じて
        //①魔法型　②バランス型　③物理型　④脳筋
        //で分類されている

        int[] status = new int[6];

        if(point%4 == 0){
            status[0] = 100;
            status[1] = 100;
            status[2] = 15;
            status[3] = 25;
            status[4] = 30;
            status[5] = 30;
        }else if(point%4 ==1){
            status[0] = 130;
            status[1] = 70;
            status[2] = 25;
            status[3] = 25;
            status[4] = 25;
            status[5] = 25;
        }else if(point%4 ==2){
            status[0] = 150;
            status[1] = 50;
            status[2] = 30;
            status[3] = 30;
            status[4] = 15;
            status[5] = 25;
        }else if(point%4 ==3){
            status[0] = 175;
            status[1] = 25;
            status[2] = 40;
            status[3] = 40;
            status[4] = 5;
            status[5] = 15;
        }

        return status;

    }
}

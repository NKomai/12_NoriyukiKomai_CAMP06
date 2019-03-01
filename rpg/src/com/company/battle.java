package com.company;

import java.util.Scanner;

public class battle {
    public static int main(String name,int[] status,Hero hero){

        int[] enemy = {500,20,30};
        int turn = 0;
        int result = 0;

        System.out.println("りゅうおう　が　あらわれた！");

        while(hero.HP >=0 && enemy[0] >= 0){ //自分か相手のHPが０になるまでこのwhile分に閉じ込める

            turn++;

            System.out.println("ステータス　／　HP：" + hero.HP + "　MP：" + hero.MP);
            System.out.println("コマンド？　⇒　1.こうげき　2.くろまほう　3.しろまほう　4.にげる");

            //入力の受付。int型変数choiceで受ける
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();

            //入力が1〜4の範囲でない場合はループに閉じ込めて、再度質問と選択肢を表示、入力を受け付け続ける
            while(5 <= command || command <= 0){
                System.out.println("1〜4の整数で選択肢を入力してください");
                System.out.println("ステータス　／　HP：" + status[0] + "　MP：" + status[1]);
                System.out.println("コマンド？\n1.こうげき　2.くろまほう　3.しろまほう　4.にげる");
                command = scanner.nextInt();
            }

            if(command == 1){
                //攻撃用のクラスを呼び出す
                attack.main(name,status,enemy);
                //続いて敵の行動を呼び出す。直前の行動で敵のHPが０になってないか確認。
                if(enemy[0] > 0) {
                    enemyMove.main(name,status,enemy);
                    if(status[0] <= 0){
                        result = 1;
                    }
                }else{
                    result = 0;
                }
            }else if(command == 2){
                //魔法攻撃用のクラスを呼び出す
                magicattack.main(name,status,enemy);
                //続いて敵の行動を呼び出す。直前の行動で敵のHPが０になってないか確認。
                if(enemy[0] > 0) {
                    enemyMove.main(name,status, enemy);
                    if(status[0] <= 0){
                        result = 1;
                    }
                }else{
                    result = 0;
                }
            }else if(command == 3){
                //魔法回復用のクラスを呼び出す
                magicheal.main(name,status,enemy);
                //続いて敵の行動を呼び出す。直前の行動で敵のHPが０になってないか確認。
                if(enemy[0] > 0) {
                    enemyMove.main(name,status, enemy);
                    if(status[0] <= 0){
                        result = 1;
                    }
                }else {
                    result = 0;
                }
            }else{
                System.out.println(name + "はにげだした！");
                result = 2;
            }

        }



        return result;

    }
}

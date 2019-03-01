package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("あなたの名前を入力してください。");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //入力された名前から質問へ飛び、得たbasePointを元にstatusを読んでステータスを作る
        int basePoint = checkStatus.main(name);
        Hero hero = new Hero(basePoint,name);
        int[] status = setStatus.main(basePoint);

        //バトル用のクラスに送って、結果だけint型の数値（0なら勝ち、１なら負け）で受け取る
        //各種パラメータは配列のまま管理すれば、配列は参照型なので
        //各クラスで参照元の情報上書いて更新をかけていけるはず
        int result = battle.main(name,status,hero);

        if(result == 0){
            System.out.println("竜王を倒した！\n\nおめでとう！　世界は平和になりました！");
        }else if(result == 1){
            System.out.println("勇者は死んでしまった…………");
        }else{
            System.out.println("おお勇者よ。敵前逃亡とは…………");
        }

    }
}


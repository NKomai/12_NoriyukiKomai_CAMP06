package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Coincase mine = new Coincase();
    Scanner scanner = new Scanner(System.in);
    int type[] = {500,100,50,10,5,1};

    for(int i=0; i<6; i++){
        int coinPush = 0;
        int countPush = 0;

        System.out.println("追加する硬貨は？");
        String coin = scanner.next();

        System.out.println("追加する枚数は？");
        String count = scanner.next();

        //int型への変換と例外処理
        try {
            coinPush = Integer.parseInt(coin);
            countPush = Integer.parseInt(count);
        }catch(NumberFormatException e){
            System.out.println("500,100,50,10,5,1のいずれかで入力してください");
            i--;
            continue;
        }


        int result = mine.AddCoins(coinPush,countPush);

        if(result != 0){
            System.out.println("500,100,50,10,5,1のいずれかで入力してください");
            i--;
        }

    }

    System.out.println("現在のコインケースの中身は以下の通り");

    for(int j=0; j<type.length; j++) {
        if (mine.GetCount(type[j]) != 0) {
            System.out.println(type[j] + "円硬貨　⇒　" + mine.GetCount(type[j]) + "枚");
        }
    }

    System.out.print("現在の総額は【"+ mine.GetAmount() + "】円です");


    }
}

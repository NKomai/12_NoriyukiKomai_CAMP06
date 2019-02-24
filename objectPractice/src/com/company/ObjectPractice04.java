package com.company;

import java.util.Scanner;

public class ObjectPractice04 {
    public static void main(String[] args){

        //Scanner準備、入力は両方ともString型なので共有
        Scanner scanner = new Scanner(System.in);

        //名前入力待機、nameで受け取る
        System.out.println("名前を入力してください");
        String name = scanner.next();

        //出身地入力待機、whereで受け取る
        System.out.println("出身地を入力してください");
        String where = scanner.next();


        //インスタンスの生成
        Person person = new Person(name,where);
        System.out.println(person.getSelfIntroduction());


    }
}

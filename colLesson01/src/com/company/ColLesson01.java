package com.company;
import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args){

        //インスタンスの生成、String型配列wordとmeaning。それぞれ要素は10個
        Word library = new Word(10);

        //スキャナー準備
        Scanner scanner = new Scanner(System.in);


        //次のwhileで使用する、周回管理用のint型変数countを準備
        int count = 0;

        //入力を受け付ける
        //eが入力されるまでwhile文でループに閉じ込める
        while(true) {

            //初回と2回目以降で表示する文章を変化
            if (count == 0) {
                System.out.println("わからなかった単語とその意味を全角スペースで区切って入力してください");
            } else {
                System.out.println("次の単語と意味を入力してください。\"e\"で終了します");
            }

            //入力を受け付け
            //nextLine()で受けなければスペースで切られてしまうので注意
            String word = scanner.nextLine();

            //eが入力されたらbreakで終了
            //入力文字列に全角スペースが含まれていたら「周回番号」をWord.javaのsetWordメソッドに送って処理
            //形式を満たしていない場合はcontinueで頭に戻す
            if (word.equals("e")) {
                break;
            } else if (word.contains(("　"))) {
                library.setWord(word, count);
            }else{
                System.out.println("無効なデータです。再入力してください");
                continue;
            }

            count++;

        }


        //入力受け付け終了後、全件表示を行う
        //roopで登録件数は管理できているので、
        for(int i=0; i < count; i++){;
            System.out.println(library.printWord(i));
        }

        System.out.println(count + "件、登録しました。");

    }
}

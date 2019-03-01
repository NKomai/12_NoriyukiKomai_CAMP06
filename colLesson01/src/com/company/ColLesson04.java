package com.company;

import java.util.Scanner;

public class ColLesson04 {
    public static void main(String[] args) {
        //インスタンスの生成。以降、ArrayListをいじるので引数はなんでも良い
        Word library = new Word(1);

        //スキャナー準備
        Scanner scanner = new Scanner(System.in);


        //次のwhileで使用する、周回回数管理用のint型変数countを準備
        int count = 0;

        //入力を受け付ける
        //eが入力されるまでwhile文でループに閉じ込める（trueが入っているので現状無限ループ）
        while (true) {

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
            //「ArrayIndexOutOfBoundsException」が返ってきたら配列の要素埋まりきっているのでbreak
            //形式を満たしていない場合はcontinueで頭に戻す
            if (word.equals("e")) {
                break;
            } else if (word.contains(("　"))) {
                try {
                    library.setArrayWord(word);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
                    break;
                }
            } else {
                System.out.println("無効なデータです。再入力してください");
                continue;
            }

            count++;

        }


        //入力受け付け終了後、全件表示を行う
        //countで登録件数は管理できている。
        for (int i = 0; i < library.sizeArray(); i++) {
            ;
            System.out.println(library.printArrayWord(i));
        }

        System.out.println(library.sizeArray() + "件、登録しました。");

    }

}

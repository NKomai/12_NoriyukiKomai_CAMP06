package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Scanner;


//ステータスを決めるための質問。
//ここで獲得したポイントをreturnで返している

public class checkStatus {
    public static int main(String name){
        Random random = new Random(); //ランダム使用の宣言

        System.out.println("それでは" + name + "さん、あなたのステータスを生成します。\nこれからする質問に答えてください");

        //質問と回答と点数を対応する形で配列に格納
        //質問一覧
        String quesArray[] = new String[8];
        quesArray[0] = "できれば働きたくない";
        quesArray[1] = "不労所得が欲しい";
        quesArray[2] = "24時間寝ていたい";
        quesArray[3] = "楽しいかどうかより、苦痛が無いかどうかで物事を選ぶ方だ";
        quesArray[4] = "ぶっちゃけ、回答するのもめんどくさい";
        quesArray[5] = "休みの日は何をして過ごす？";
        quesArray[6] = "次の4つの中で一番好きな食べ物は？";
        quesArray[7] = "運はいい方だ";
        //回答一覧
        String ansArray[] = new String[8];
        ansArray[0] = "1：そう思う　2：まぁそう思う　3：あまりそう思わない　4：そうは思わない";
        ansArray[1] = "1：そう思う　2：まぁそう思う　3：あまりそう思わない　4：そうは思わない";
        ansArray[2] = "1：そう思う　2：まぁそう思う　3：あまりそう思わない　4：そうは思わない";
        ansArray[3] = "1：当てはまる　2：まぁ当てはまる　3：あまり当てはまらない　4：当てはまらない";
        ansArray[4] = "1：その通り　2：まぁその通り　3：そこまででは……　4：そんなことはない";
        ansArray[5] = "1：家でだらだら　2：部屋の片付け　3：外に散歩　4：外で運動";
        ansArray[6] = "1：うどん　2：焼き肉　3：寿司　4：フランス料理";
        ansArray[7] = "1：豪運の持ち主　2：悪くはない　3：ちょっと悪いかもしれない　4：おみくじは必ず大凶";
        //点数一覧。{{1,2,3,4}……}の形でもかけるが、管理しやすいように敢えて分けた。
        int ansPoint[][] = new int[8][4];
        ansPoint[0][0] = 0;
        ansPoint[0][1] = 1;
        ansPoint[0][2] = 2;
        ansPoint[0][3] = 5;
        ansPoint[1][0] = 0;
        ansPoint[1][1] = 1;
        ansPoint[1][2] = 4;
        ansPoint[1][3] = 5;
        ansPoint[2][0] = 0;
        ansPoint[2][1] = 1;
        ansPoint[2][2] = 2;
        ansPoint[2][3] = 3;
        ansPoint[3][0] = 0;
        ansPoint[3][1] = 1;
        ansPoint[3][2] = 2;
        ansPoint[3][3] = 3;
        ansPoint[4][0] = 0;
        ansPoint[4][1] = 2;
        ansPoint[4][2] = 3;
        ansPoint[4][3] = 5;
        ansPoint[5][0] = 0;
        ansPoint[5][1] = 1;
        ansPoint[5][2] = 1;
        ansPoint[5][3] = 5;
        ansPoint[6][0] = 0;
        ansPoint[6][1] = 0;
        ansPoint[6][2] = 0;
        ansPoint[6][3] = 5;
        ansPoint[7][0] = 1;
        ansPoint[7][1] = 0;
        ansPoint[7][2] = 0;
        ansPoint[7][3] = 5;

        //点数と問題数チェックの初期化
        int point = 0;
        int total = 0;

        //5問選択されるように変数totalで管理する。1周するごとにtotal++される
        while(total < 5) {
            //ランダムで選出するための変数numを設定
            int num = random.nextInt(quesArray.length);

            //ランダムで選ばれた数字numに対応する配列の要素を質問と回答から選出して表示
            System.out.println(quesArray[num]);
            System.out.println(ansArray[num]);

            //入力の受付。int型変数choiceで受ける
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            //入力が1〜4の範囲でない場合はループに閉じ込めて、再度質問と選択肢を表示、入力を受け付け続ける
            while(5 <= choice || choice <= 0){
                System.out.println("1〜4の整数で選択肢を入力してください");
                System.out.println(quesArray[num]);
                System.out.println(ansArray[num]);
                choice = scanner.nextInt();
            }

            //int型変数pointにchoiceの値を足して行くことで、総合点を計算
            point += ansPoint[num][(choice-1)];

            //使用した質問と回答を配列から取り除く処理
            //　①配列をリスト化する
            //　②配列要素に合致する物をリストから除外
            //　③その後再度配列化して元の変数に代入し直す

            //ここは質問の処理
            List<String> list = new ArrayList<String>(Arrays.asList(quesArray));
            list.remove(quesArray[num]);
            quesArray = (String[]) list.toArray(new String[list.size()]);

            //ここは回答の処理
            List<String> list2 = new ArrayList<String>(Arrays.asList(ansArray));
            list2.remove(ansArray[num]);
            ansArray = (String[]) list2.toArray(new String[list2.size()]);

            //最後に、周回管理のtotal++を入れている
            total++;

        }

        return point;

    }
}

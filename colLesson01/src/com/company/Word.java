package com.company;
import java.util.ArrayList;

public class Word{
    public String[] word;
    public String[] meaning;
    public ArrayList<String> arrayWord;
    public ArrayList<String> arrayMean;

    public Word(){
        this.arrayWord = new ArrayList<>();
        this.arrayMean =  new ArrayList<>();
    }


    //引数によって配列の要素数を決定し、インスタンス生成
    public Word(int length) {
        this.word = new String[length];
        this.meaning = new String[length];
    }

    //=======以下、配列の場合のメソッド=======
    //登録用メソッド「setWord」、戻り値ナシ
    //引数numに基づいて、引数str1,str2をword,meaningの要素として格納する
    //例外を拾ったら、呼び出し元にエラーを投げ返す
    public void setWord(String str,int num) throws ArrayIndexOutOfBoundsException {
        int point = str.indexOf("　");
        this.word[num] = str.substring(0,point);
        this.meaning[num] = str.substring(point+1);
    }

    //表示用メソッド「printWord」、戻り値はString型
    public String printWord(int num){
        String str = "単語：" + this.word[num] + "　意味：" + this.meaning[num];
        return str;
    }

    //=======以下、ArrayListの場合のメソッド=======
    public void setArrayWord(String str) throws ArrayIndexOutOfBoundsException{
        int point = str.indexOf("　");
        this.arrayWord.add(str.substring(0,point));
        this.arrayMean.add(str.substring(point+1));
    }

    public String printArrayWord(int num){
        String str =  "単語：" + this.arrayWord.get(num) + "　意味：" + this.arrayMean.get(num);
        return str;
    }

    public int sizeArray(){
        return this.arrayWord.size();
    }

}

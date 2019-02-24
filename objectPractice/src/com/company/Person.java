package com.company;

public class Person {

    public String name; //名前
    public String where; //出身地

    public Person(String a, String b){
        this.name = a;
        this.where = b;
    }

    public String getSelfIntroduction(){
        return ("私の名前は" + name + "です。出身地は" + where + "です");
    }


}


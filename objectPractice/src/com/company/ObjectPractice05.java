package com.company;

public class ObjectPractice05 {
    public static void main(String[] args){

        String[] name = {"森田","木村","高山","茂木"};
        String[] where = {"奈良","埼玉","東京","沖縄"};

        for(int i=0; i < name.length; i++){
            Person person = new Person(name[i],where[i]);
            System.out.println(person.getSelfIntroduction());
        }


    }
}

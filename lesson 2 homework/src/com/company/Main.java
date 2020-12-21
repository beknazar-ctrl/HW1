package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(Бишкек(10,20));
        System.out.println(Бишкек(11,21));
        System.out.println(Бишкек(12,22));
        System.out.println(Бишкек(13,23));
        System.out.println(Бишкек(14,24));
    }
    public static String Бишкек(int temp, int age){
        if(age>20&&age<45&&temp>-20&&temp<30){
            return "Можно идти гулять";
        }
        else if(age<20&&age>0&&temp>0&&temp<28){
            return "Можно идти гулять";
        }
        else if (age>45&&temp>-10&&temp<25){
            return "Можно идти гулять";
        }
        else{
            return "Оставайтесь дома";
        }
    }
}
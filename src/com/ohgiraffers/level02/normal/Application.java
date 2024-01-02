package com.ohgiraffers.level02.normal;
import com.ohgiraffers.level02.normal.RandomMaker;
public class Application {
    public static void main(String[] args) {

        RandomMaker ram = new RandomMaker();
        System.out.println(ram.randomNumber(-200,100));

        System.out.println(ram.rockPaperScissors());

        System.out.println(ram.tossCoin());
    }
}

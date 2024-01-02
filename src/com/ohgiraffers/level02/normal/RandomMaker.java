package com.ohgiraffers.level02.normal;

import java.util.Random;

//첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출)
//인자로 전달한 정수 길이의 랜덤한 문자열을 출력함 (randomUpperAlphabet 호출)
//가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)
//앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
public class RandomMaker {

    public static int randomNumber(int min, int max) {
        int range = (max + 1) - min; //(최대값+1)-최소값 = 범위
        int random1 = (int) (Math.random() * range) + min;
        return random1;
    }

    public static String rockPaperScissors() {

        int random = (int) (Math.random() * 3);

        return random == 0 ? "가위" : random == 1 ? "바위" : "보";


    }
    public static String tossCoin()  {
        int random = (int) (Math.random() * 2);
        return random == 0 ? "앞면" : "뒷면";
    }
}

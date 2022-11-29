package whahn.leetcode.low;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 문제: https://leetcode.com/problems/roman-to-integer/
 * 문제유형: 숫자 회문
 * 풀이날짜: 2022-11-29
 */
public class Myself003 {
    public static void main(String[] args) {
        String s = "VX";

        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' :
                    number = 1000;
                    break;
                case 'D' : number = 500; break;
                case 'C' : number = 100; break;
                case 'L' : number = 50; break;
                case 'X' : number = 10; break;
                case 'V' : number = 5; break;
                case 'I' : number = 1; break;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }

        System.out.println(answer);
    }
}

package whahn.leetcode.low;

/**
 * 문제: https://leetcode.com/problems/palindrome-number/
 * 문제유형: 숫자 회문
 * 풀이날짜: 2022-11-23
 */
public class Myself002 {
    public static void main(String[] args) {
        int a = 101;

        String s = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();

        System.out.println("max = " + s.equals(stringBuilder.toString()));
    }
}

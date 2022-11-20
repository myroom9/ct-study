package whahn.leetcode.low;

/**
 * 문제: https://leetcode.com/problems/richest-customer-wealth/
 * 문제유형: 2차원 배열
 * 풀이날짜: 2022-11-21
 */
public class Myself001 {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,5}, {7,3}, {3,5}};

        int max = 0;
        int temp = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                temp += i;
            }
            if (max < temp) {
                max = temp;
            }
            temp = 0;
        }

        System.out.println("max = " + max);
    }
}

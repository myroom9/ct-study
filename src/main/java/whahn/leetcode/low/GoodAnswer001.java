package whahn.leetcode.low;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/richest-customer-wealth/discuss/961720/Java-or-1-liner-or-Time-beats-100-or-Explained
 */

public class GoodAnswer001 {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,5}, {7,3}, {3,5}};

        int max =  Arrays.stream(accounts)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .getAsInt();

        System.out.println("max = " + max);
    }
}

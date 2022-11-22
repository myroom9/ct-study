package whahn.leetcode.low;

/**
 * https://leetcode.com/problems/palindrome-number/discuss/2739816/JAVA-oror-NO-STRING-oror-FASTER-THAN-97-oror-EASY
 */

public class GoodAnswer002 {
    public static void main(String[] args) {
        int x = -121;

        if (x < 0) {
            x *= -1;
        }

        int original = x;
        int rev = 0;
        while(x>0){
            rev = x%10 + rev*10;
            x= x/10;
        }

        System.out.println(rev == original);
    }
}

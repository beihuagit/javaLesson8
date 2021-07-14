package com.basics.data;

/**
 * @Author: xiaole.chen
 * @Date: 2020/1/15 12:27
 * @Description: 递归算法
 * */
public class Test01 {

    public static void main(String[] args) {


        //test01(100);
        //System.out.println(Triangle.getTotalPoints(10));
        //System.out.println(Triangle.getPointsByRecression(10));
        //System.out.println(TestFibonnacci.getNumber(10));


        final int NMAX = 10;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++) {
            odds[n] = new int[n + 1];
        }

        // fill triangular array
        for (int n = 0; n < odds.length; n++) {
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }

                odds[n][k] = lotteryOdds;
            }
        }

        // print triangular array
        for (int[] row : odds) {
            StringBuilder ss = new StringBuilder(" ");
            for (int odd : row) {
                System.out.printf("%4d", odd);
                ss.append(" ");
            }
            System.out.printf("%s\n", ss);
            System.out.print("\\");
            System.out.println();
        }

    }

    private static void test01(int n) {
        if (n == 0) {
            return;
        }
        //n --;
        //System.out.println(n);
        if (n % 2 == 0) {
            System.out.println(n);
        }
        test01(n - 1);
    }
}

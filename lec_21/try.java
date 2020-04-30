import java.io.*;
import java.util.*;

public class lec211{

    public static void main(String[] args){
        b
        costofthepath(arr);
    }

    public static void costofthepath(int[][] arr) {
        int[][] dp = new int[arr.length][arr[0].length];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == arr.length && j == arr[0].length) {
                    dp[i][j] = arr[i][j];
                } else if (i == arr.length) {
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                } else if (j == arr[0].length) {
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                } else {
                    if (dp[i][j + 1] <= dp[i + 1][j]) {
                        dp[i][j] = dp[i][j + 1];
                    } else {
                        dp[i][j] = dp[i + 1][j];
                    }
                    dp[i][j] += arr[i][j];
                }
            }
        }
        System.out.print(dp[0][0]);
    }
}
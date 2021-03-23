package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P1463 {
    static int[] dp = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        dp[1] = 0;
        dp[2] = 1;

        for (int i=3; i<=n; i++) {
            dp[i] = dp[i-1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            } 

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }

        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}
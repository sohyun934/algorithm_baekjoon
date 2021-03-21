package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class P1149 {
    static int[] arr;
    static int[] dp = new int[11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        arr = new int[t];
        int max = 0;

        for (int i=0; i<t; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) max = arr[i];
        }

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i=3; i<=max; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        for (int num : arr) {
            bw.write(String.valueOf(dp[num]) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
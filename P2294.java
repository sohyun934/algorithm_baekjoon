package baekjoon;

import java.io.*;
import java.util.*;

public class P2294 {
    static ArrayList<Integer> pouch = new ArrayList<>();
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i=0; i<n; i++) pouch.add(Integer.parseInt(br.readLine()));

        dp = new int[k+1];
        Arrays.fill(dp, 10001);

        dp[0] = 0;

        for (int i=0; i<n; i++) { // 화폐
        	for (int j=pouch.get(i); j<=k; j++) { // 금액
        		if (dp[j-pouch.get(i)] != 10001) { // j-1원을 만들 수 있다면, 즉 i원을 가지고 k원을 만들 수 있다면
        			dp[j] = Math.min(dp[j], dp[j-pouch.get(i)] + 1);
        		}
        	}
        }

        if (dp[k] == 10001) dp[k] = -1;

        bw.write(String.valueOf(dp[k]));
        bw.flush();
        bw.close();
    }
} 
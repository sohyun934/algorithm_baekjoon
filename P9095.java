package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		int[][] dp = new int[testCase+1][testCase+1];

		StringTokenizer st;

		for (int i=1; i<=testCase; i++) {
			st = new StringTokenizer(br.readLine());

			dp[i][1] = Integer.parseInt(st.nextToken());
			dp[i][2] = Integer.parseInt(st.nextToken());
			dp[i][3] = Integer.parseInt(st.nextToken());

			if (i > 1) {
				for (int j=1; j<=3; j++) {
					int min = 0;

					if (j == 1) {
						min = Math.min(dp[i-1][2], dp[i-1][3]);
					} else if (j == 2) {
						min = Math.min(dp[i-1][1], dp[i-1][3]);
					} else if (j == 3) {
						min = Math.min(dp[i-1][1], dp[i-1][2]);
					}

					dp[i][j] = dp[i][j] + min; 
				}
			}
		}

		int result = Math.min(dp[testCase][3], Math.min(dp[testCase][1], dp[testCase][2]));

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
} 
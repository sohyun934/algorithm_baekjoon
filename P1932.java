package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1932 {
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		dp = new int[n][n];


		StringTokenizer st;

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j=0; j<=i; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i=n-2; i>=0; i--) {
			for (int j=0; j<=i; j++) {
				dp[i][j] += Math.max(dp[i+1][j], dp[i+1][j+1]);
			}
		}

		bw.write(String.valueOf(dp[0][0]));
		bw.flush();
		bw.close();
	}
}
package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class antWarrior {
	static int[] arr;
	static int[] dp;

    public static void main (String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int n = Integer.parseInt(br.readLine());
       arr = new int[n];
       dp = new int[n];

       StringTokenizer st = new StringTokenizer(br.readLine());

       for (int i=0; i<n; i++) {
    	   arr[i] = Integer.parseInt(st.nextToken());
       }

       dp[0] = arr[0];
       dp[1] = Math.max(arr[0], arr[1]);

       for (int i=2; i<n; i++) {
    	   dp[i] = Math.max(dp[i-2]+arr[i], dp[i-1]);
       }

       bw.write(String.valueOf(dp[n-1]));
       bw.flush();
       bw.close();
       br.close();
    }
}
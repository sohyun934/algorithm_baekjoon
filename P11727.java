import java.io.*;
import java.util.*;

public class Main {
    static int[] dp = new int[1001];
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        dp[1] = 1;
        dp[2] = 3;
        
        for (int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        
        bw.write(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
    }
}
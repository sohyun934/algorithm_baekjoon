package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2630 {
	static int[][] paper;
	static StringTokenizer st;
	static int color[] = {0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j=0; j<n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		divide(n, 0, 0);

		bw.write(String.valueOf(color[0]) + "\n");
		bw.write(String.valueOf(color[1]));
		bw.flush();
		bw.close();
		br.close();
	}

	public static void divide(int n, int x, int y) {
		if(isSame(n, x, y)) return;

		divide(n/2, x, y);
		divide(n/2, x, y+n/2);
		divide(n/2, x+n/2, y);
		divide(n/2, x+n/2, y+n/2);
	}

	public static boolean isSame(int n , int x , int y) {
		int val = paper[x][y];

		for (int i = x; i < x+n; i++) {
			for (int j = y; j < y+n; j++) {
				if(val != paper[i][j]) return false;
			}
		}

		color[val]++;
		return true;
	}	
}
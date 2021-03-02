package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1780 {
	static int[][] paper;
	static int[] color = new int[3];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];
		StringTokenizer st;

		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j=0; j<n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		divide(n, 0, 0);

		bw.write(String.valueOf(color[2]) + "\n");
		bw.write(String.valueOf(color[0]) + "\n");
		bw.write(String.valueOf(color[1]));

		bw.flush();
		bw.close();
		br.close();
	}

	public static void divide(int n, int x, int y) {
		if (isEqual(n, x, y)) return;

		int size = n/3;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				divide(size, x+(size*i), y+(size*j));
			}
		}
	}

	public static boolean isEqual(int n, int x, int y) {
		for(int i=x; i<x+n; i++) {
			for (int j=y; j<y+n; j++) {
				if (paper[x][y] != paper[i][j]) return false; 
			}
		}

		if (paper[x][y] == -1) {
			color[2]++;
		} else {
			color[paper[x][y]]++;
		}
		return true;
	}
}
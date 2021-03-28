package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P9184 {
	static int[][][] result = new int[21][21][21];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = 0;
		int b = 0;
		int c = 0;

		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());

			if (a == -1 && b == -1 && c == -1) break;

			bw.write("w("+a+", "+b+", "+c+") = " + w(a, b, c) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}

	public static int w(int a, int b, int c) {
		if (a <= 20 && a > 0 && b <= 20 && b > 0 && c <= 20 && c > 0) {
			if (result[a][b][c] != 0) {
				return result[a][b][c]; // 기저 조건
			}
		}

		if (a <= 0 || b <= 0 || c <= 0) return 1;

		if (a > 20 || b > 20 || c > 20) {
			return result[20][20][20] = w(20, 20, 20);
		} else if (a < b && b < c) {
			return result[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		} else {
			return result[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}
}
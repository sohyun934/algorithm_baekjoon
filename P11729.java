package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P11729 {
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		bw.write((int) (Math.pow(2, n) - 1) + "\n");

		hanoi(n, 1, 2, 3);

		bw.flush();
		bw.close();
	}

	public static void hanoi(int n, int from, int mid, int to) throws IOException {
		if (n == 1) {
			bw.write(from + " " + to + "\n");
			return;
		}

		// 자신을 제외한 나머지 원판들을 경유지로 이동
		hanoi(n - 1, from, to, mid); 

		// 목적지로 이동
		bw.write(from + " " + to + "\n");

		// 경유지에 위치한 나머지 원판들을 자신이 위치한 목적지로 이동
		hanoi(n - 1, mid, from, to);
	}
}
package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P3986 {
	static Stack<Character> st;
	static int cnt = 0;
	static String word = "";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++) {
			st = new Stack<>();
			word = br.readLine();

			for (char w : word.toCharArray()) {
				if (st.size() > 0 && st.peek() == w) {
					st.pop();
				} else {
					st.push(w);
				}
			}

			if (st.isEmpty()) cnt++;
		}

		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
		br.close();
	}
}
package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		Stack st = new Stack();
		char closing_brace = ')';
		char open_brace = '(';

		for (int i=0; i<testCase; i++) {
			char[] arr = br.readLine().toCharArray();

			String vps = "YES";

			for (int j=0; j<arr.length; j++) {
				if (arr[0] == closing_brace) {
					vps = "NO";
					break;
				} else if (arr[j] == open_brace) {
					st.push(arr[j]);
				} else if (arr[j] == closing_brace) {
					if (st.empty()) {
						vps = "NO";
						break;
					} else {
						st.pop();
					}
				}
			}

			if (!st.empty()) vps = "NO";
			st.clear();

			bw.write(vps + "\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}
}
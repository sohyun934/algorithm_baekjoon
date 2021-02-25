package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P12605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		Stack<String> st = new Stack<>();

		for (int i=1; i<=testCase; i++) {
			String[] strs = br.readLine().split(" ");

			for (String str : strs) {
				st.push(str);
			}

			bw.write("Case #" + i + ":");

			while (!st.empty()) {
				bw.write(" " + (String)st.pop());
			}

			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}	
}
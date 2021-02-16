package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int size = Integer.parseInt(br.readLine());
		Stack st = new Stack();
		int sum = 0;

		for (int i=0; i<size; i++) {
			int val = Integer.parseInt(br.readLine());

			if (val == 0) {
				st.pop();
			} else {
				st.push(val);
			}
		}

		while(!st.empty()) {
			sum += (int)st.pop();
		}

		bw.write(String.valueOf(sum));

		bw.flush();
		br.close();
		bw.close();
	}
}
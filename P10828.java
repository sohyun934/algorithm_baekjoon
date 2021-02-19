package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine());
		Stack st = new Stack();

		for (int i=0; i<testCase; i++) {
			String str = br.readLine();

			if (str.contains("push")) {
				String[] arr = str.split(" ");
				st.push(arr[1]);
			} else if (str.equals("top")) {
				if (st.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write((String)st.peek() + "\n");
				}
			} else if (str.equals("size")) {
				bw.write(String.valueOf(st.size()) + "\n");
			} else if (str.equals("pop")) {
				if (st.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write((String)st.pop() + "\n");
				}
			} else if (str.equals("empty")) {
				if (st.empty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
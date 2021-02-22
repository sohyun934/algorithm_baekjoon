package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P10930 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Queue<Integer> q = new LinkedList<Integer>();
		int cnt = Integer.parseInt(br.readLine());
		int num = 0;
		StringTokenizer st;

		for (int i=0; i<cnt; i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();

			if (command.equals("push")) {
				num = Integer.parseInt(st.nextToken());

				q.add(num);
			} else if (command.equals("pop")) {
				if (!q.isEmpty()) {
					bw.write(q.remove() + "\n");
				} else {
					bw.write("-1\n");
				}
			} else if (command.equals("size")) {
				bw.write(q.size() + "\n");
			} else if (command.equals("empty")) {
				if (q.isEmpty()) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			} else if (command.equals("front")) {
				if (q.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(q.peek() + "\n");
				}
			} else if (command.equals("back")) {
				if (q.isEmpty()) {
					bw.write("-1\n");
				} else {
					bw.write(num + "\n");
				}
			}
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
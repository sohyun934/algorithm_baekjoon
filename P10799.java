package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P10799 {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack st = new Stack();
		int cnt = 0;

		String brakets = br.readLine();
		char[] arr = brakets.toCharArray();

		for (int i=0; i<arr.length; i++) {
			if (arr[i] == '(') {
				st.push('(');
			} else if (arr[i] == ')') {
				st.pop();

				if (arr[i-1] == '(') {
					cnt += st.size();
				} else {
					cnt++;
				}
			}

		}

		System.out.print(cnt);
	}	
}
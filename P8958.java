package baekjoon;

import java.io.*;

public class P8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int caseNum = Integer.parseInt(br.readLine());

		for (int i=0; i<caseNum; i++) {
			String answer = br.readLine();
			int temp = 0;
			int sum = 0;

			for (int j=0; j<answer.length(); j++) {

				if (answer.charAt(j) == 'O') {
					temp += 1;
				} else {
					temp = 0;
				}

				sum += temp;
			}

			System.out.println(sum);
		}
	}
}
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String[] str = br.readLine().split(" ");
		double[] arr = new double[str.length];
		double max = Integer.parseInt(str[0]);

		double sum = 0;
		double avg = 0;

		for (int i=0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);

			if (max < arr[i]) max = arr[i];
		}

		for (int i=0; i<arr.length; i++) {
			arr[i] = arr[i] * 100 / max;
		}

		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}

		avg = sum / num;
		System.out.print(avg);

        br.close();
	}
}
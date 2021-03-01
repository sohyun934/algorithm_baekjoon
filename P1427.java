package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int[] arr = new int[str.length()];
		int biggestIndex = 0;

		for (int i=0; i<str.length(); i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}

		for (int i=0; i<arr.length; i++) {
			biggestIndex = i;

			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] > arr[biggestIndex]) biggestIndex = j;
			}

			if (biggestIndex != i) {
				int temp = arr[biggestIndex];
				arr[biggestIndex] = arr[i];
				arr[i] = temp;
			}
		}

		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
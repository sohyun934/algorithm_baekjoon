package baekjoon;

import java.io.*;

public class P2562 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int idx = 0;
		int[] arr = new int[9]; 

		for (int i=0; i<9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];

		for (int i=0; i<arr.length-1; i++) {
			if (max < arr[i+1]) {
				max = arr[i+1];
				idx = i+1;
			}
		}

		System.out.println(max);
		System.out.print(idx+1);
	}
} 
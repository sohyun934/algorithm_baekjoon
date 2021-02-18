package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P10818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

		quickSort(arr, 0, n-1);

		System.out.printf("%s %s", arr[0], arr[n-1]);
		br.close();
	}

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	static void quickSort(int[] a, int left, int right) {
		int pl = left;					
		int pr = right;					
		int x = a[(pl + pr) / 2];

		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);

		if (left < pr)  quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}	
}
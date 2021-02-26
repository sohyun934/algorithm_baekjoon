package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		boolean isFar = false;
		int result = 0;

		for (int idx=0; idx<n; idx++) {
			String str = br.readLine();
			char[] cr = str.toCharArray();

			isFar = false;
			for (int j=0; j<cr.length-1; j++) {
				for (int i=1; i<cr.length; i++) {
					if (j!=i && cr[j] == cr[i]) {
						for (int z=j; z<i; z++) {
							if (cr[z] != cr[z+1]) isFar = true;
						}
					}
				}
			}

			if (!isFar) result++;
		}

		System.out.println(result);
		br.close();
	}	
}
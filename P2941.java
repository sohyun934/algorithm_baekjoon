package baekjoon;

import java.io.*;

public class P2941 {
    	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] strArray = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for (int i=0; i<strArray.length; i++) {
			if (str.indexOf(strArray[i]) >= 0) {
				str = str.replace(strArray[i], "a");
			}
		}

		System.out.print(str.length());
		br.close();
	}
}
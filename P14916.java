import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int change = Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = {5, 2};
		
		
		if (change == 1 || change == 3) {
			count = -1;
		} else {
			for (int coin : arr) {
				count += change / coin;
				change %= coin;
				
				if (change % 2 != 0) {
					count--;
					change += coin;
				} else if (coin == 5 && change == 0) {
					break;
				}
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}

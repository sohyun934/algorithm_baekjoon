import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] dials = br.readLine().toCharArray();
        int num = 0;
        
        for (char ch : dials) {
        	int cnt = 2;
        	
        	if (80 <= ch && ch <= 83) {
        		num += 8;
        	} else if (84 <= ch && ch <= 86) {
        		num += 9;
        	} else if (87 <= ch && ch <= 90) {
        		num += 10;
        	} else if (ch >= 65) {
        		for (char i=65; i<80; i+=3) {
	        		
	        		cnt ++;
	        		
	        		if (ch == i || ch == (i+1) || ch == (i+2)) {
	        			num += cnt;
	        		}
	        	}
        	}
        }
        
        System.out.println(num);
    }
}
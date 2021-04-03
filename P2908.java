import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int result = 0;
        
        if (flip(a) > flip(b)) {
        	result = flip(a);
        } else {
        	result = flip(b);
        }
        
        System.out.print(result);
        
        br.close();
    }
    
    public static int flip(int num) {
    	int result = 0;
    	while (num != 0) {
    		result = result * 10 + num % 10;
    		num /= 10;
    	}
    	
    	return result;
    }
}
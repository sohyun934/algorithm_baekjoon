import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int r = 0;
        int t = Integer.parseInt(br.readLine());
        String s = "";
        StringBuilder p = new StringBuilder("");
            
        for (int idx=0; idx<t; idx++) {
        	String[] str = br.readLine().split(" ");
            r = Integer.parseInt(str[0]);
            s = str[1];
            
            for (int i=0; i<s.length(); i++) {
                for (int j=0; j<r; j++) {
                	
                	System.out.print(s.charAt(i));
                }    
            }
            
            System.out.println();
        }
        
        br.close();
    }
}
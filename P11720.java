import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        String str = "";
        
        do {
            str = br.readLine();
        } while (str.length() != n);
        
        char[] ch = str.toCharArray();
        int sum = 0;
        
        for (char c : ch) {
        	sum += Character.getNumericValue(c);
        }
        
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = "";
        do {
            s = br.readLine().toLowerCase();
        } while (s.length() > 100);
       
        for (char i=97; i<123; i++) {
            System.out.print(s.indexOf(i) + " ");
        }
    }
}
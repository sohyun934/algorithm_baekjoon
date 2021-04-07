import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int number = Integer.parseInt(br.readLine());
        int copy = number;
        int cycle = 0;
        
        while (true) {
            cycle++;
            
            int a = number / 10;
            int b = number % 10;
            int sum = a + b;
            
            number = (b * 10) + (sum % 10);
             
            if (number == copy) break;
        }
        
        br.close();
        System.out.println(cycle);        
    }
}
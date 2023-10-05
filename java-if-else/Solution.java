import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        
        int N = 0;
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do{
            N = Integer.parseInt(bufferedReader.readLine().trim());
        }while(N<1 || N>100);

        bufferedReader.close();
        
        if(N%2==0 && N>=2){
            if(N<=5 || N>20){
                System.out.println("Not Weird");
            }else {
                System.out.println("Weird");
            }
        }else if(N%2 != 0){
            System.out.println("Weird");
        }
        
    }
}
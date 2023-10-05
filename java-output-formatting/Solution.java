import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("================================");
        for(int i=0; i<3; i++){
            String string = s.next();
            int intero = s.nextInt();
            
            System.out.printf("%-15s",string);
            System.out.printf("%03d",intero);
            System.out.println();
        }
        System.out.println("================================");
    }
}
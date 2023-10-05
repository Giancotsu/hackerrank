import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        /* 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i=0;
        double d;
        String s;
        try{
            System.out.println("Inserisci un intero: ");
            i = Integer.parseInt(br.readLine());
            System.out.println(i);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        */
        
        
        int intero=0;
        double dou=0.0;
        String stringa = null;

        Scanner scanner = new Scanner(System.in);
        //scanner.useDelimiter("\\n");
        scanner.useLocale(Locale.US);

        intero = scanner.nextInt();
        scanner.nextLine();
        dou = scanner.nextDouble();
        scanner.nextLine();
        stringa  = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + stringa);
        System.out.println("Double: " + dou);
        System.out.println("Int: " + intero);
        
    }
}
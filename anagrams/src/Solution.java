import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    static boolean isAnagram(String a, String b) {
        char temp = 0;
        if(a.length() != b.length()){
            return false;
        }
        char[] C = new char[a.length()];
        char[] D = new char[b.length()];
        a = a.toUpperCase();
        b = b.toUpperCase();


        for(int i = 0; i < a.length(); i++){
            C[i] = a.charAt(i);
            D[i] = b.charAt(i);
        }

        for (int i = 0; i <a.length() ; i++) {
            for (int j = 0; j <a.length() ; j++) {
                if(C[j] > C[i]){
                    temp = C[i];
                    C[i] = C[j];
                    C[j] = temp;
                }
            }
        }

        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < b.length() ; j++) {
                if(D[j] > D[i]){
                    temp = D[i];
                    D[i] = D[j];
                    D[j] = temp;
                }
            }
        }


        //Arrays.sort(C);
        //Arrays.sort(D);
        for(int i = 0; i < a.length(); i++) {
            if (C[i] != D[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b =  scan.next();
       // scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

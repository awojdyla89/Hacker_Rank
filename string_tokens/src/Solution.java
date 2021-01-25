import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); // He is a very very good boy, isn't he?

        String[] sentence = s.trim().split("[ '.,!?]+");
        for (int i = 0; i < sentence.length ; i++) {
            System.out.print(sentence[i]);
        }

        if(s == null || s.trim().equals(""))
            System.out.println("0");
        else if(s.length() > 999999) {
            return;
        }else{
            System.out.println(sentence.length);
        }

        for (int i = 0; i < sentence.length ; i++) {
            System.out.println(sentence[i]);
        }

        scan.close();
    }
}

/*

    String s = scan.nextLine();
    String[] items = s.trim().split("[ !,?.\\_'@]+");

    if(s == ""){
            System.out.println("0");
            }
            else if(s.length() > 400000){
            return;
            }
            else{
            System.out.println(items.length);
            }

            for(String item: items){
            System.out.println(items);
            }
            scan.close();



 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        BigInteger add = a.add(b);
        BigInteger multi = a.multiply(b);

        System.out.println(add);
        System.out.println(multi);

    }
}

// 123456789123456789
//100000000000000000
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ELF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        BigInteger factorial = new BigInteger("1");
        
        for(int i = 2; i <= N; i++)
        {
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(multiplier);
        }
        
        System.out.println(factorial);
    }
}

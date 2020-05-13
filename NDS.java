import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class NDS {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        
        int nonDivisibleSubsetCardinality = 0;
        
        int[] modulusBuckets = new int[K];
        
        //Place the values in buckets based on mod K
        for(int i = 0; i < N; i++)
        {
            int bucket = input.nextInt() % K;
            modulusBuckets[bucket] += 1;
        }
        
        nonDivisibleSubsetCardinality += (modulusBuckets[0] >= 1) ? 1 : 0;
        nonDivisibleSubsetCardinality += (K%2 == 0 && modulusBuckets[K/2] >= 1) ? 1 : 0;
        
        int maxBuckets = 0;
        if(K%2 == 0)
        {
            maxBuckets = (K/2)-1;
        }
        else
        {
            maxBuckets = K/2;
        }
        
        for(int i = 1; i <= maxBuckets; i++)
        {
            nonDivisibleSubsetCardinality += Math.max(modulusBuckets[i], modulusBuckets[K-i]);
        }
        
        System.out.println(nonDivisibleSubsetCardinality);
    }
}

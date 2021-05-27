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

class Result {

    /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
        
        int front = frontcount(n,p);
        int back = backcount(n,p);
        
        return Math.min(front,back);
        
    }
    
    public static int frontcount(int n,int p)
    {
        int pageFlip=0;
        int i =1;
        while(i<n)
        {
            if(i==p)
            {
                return pageFlip;
            }
            else
            {
                if((i+1)%2==0)
                {
                    pageFlip++;
                }
                
            }
            i++;
        }
        
        return pageFlip;
    }
    
    public static int backcount(int n,int p)
    {
        int pageFlip=0;
        int i = n;
        while(i>=1)
        {
            if(i==p)
            {
                return pageFlip;
            }
            else
            {
                if((i-2)%2==0)
                {
                    pageFlip++;
                }
            }
            i--;
        }
        return pageFlip;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

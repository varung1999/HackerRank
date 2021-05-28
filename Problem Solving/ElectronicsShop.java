import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int keyboards[] = new int[n];
        for(int i=0;i<n;i++)
        {
            keyboards[i]=sc.nextInt();
        }
        
        int drives[] = new int[m];
        for(int i = 0;i<m;i++)
        {
            drives[i]=sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                int comb = keyboards[i]+drives[j];
                
                if(comb<=b && comb>max)
                {
                    max=comb;
                }
            }
        }
        
        if(max!=Integer.MIN_VALUE)
        {
            System.out.println(max);
        }
        else
        {
            System.out.println(-1);
        }
        
    }
}

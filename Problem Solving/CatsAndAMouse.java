import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 0;
        while(i<t)
        {
            int cA = sc.nextInt();
            int cB = sc.nextInt();
            int mouse = sc.nextInt();
            
            int diffA = Math.abs(cA-mouse);
            int diffB = Math.abs(cB-mouse);
            
            if(diffA==diffB)
            {
                System.out.println("Mouse C");
            }
            else if(diffA>diffB)
            {
                System.out.println("Cat B");
            }
            else if(diffA<diffB)
            {
                System.out.println("Cat A");
            }
            i++;
        }
    }
}

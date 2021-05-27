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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            int current = arr.get(i);
            
            if(map.containsKey(current))
            {
                int value = map.get(current);
                value++;
                map.put(current, value);
            }
            else
            {
                map.put(current, 1);
            }
            
        }
        int i =0;
        int k[] = new int[5];//1 2 3 4 5 
        int v[] = new int[5];//2 2 3 3 1
        for(Map.Entry<Integer, Integer> entry : map.entrySet() )
        {
            k[i]=entry.getKey();
            v[i]= entry.getValue();
            i++;
        }
        
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int j=0;j<v.length;j++)
        {
            if(v[j]>max)
            {
                max=v[j];
                maxIndex=j;
            }
        }
        
            
        return k[maxIndex];


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
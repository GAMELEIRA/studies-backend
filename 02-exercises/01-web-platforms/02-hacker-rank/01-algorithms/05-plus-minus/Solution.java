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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        double quantityPositives = 0.0;
        double quantityNegatives = 0.0;
        double quantityNeutral = 0.0;
        double negativeProportion = 0.0;
        double positiveProportion = 0.0;
        double neutralProportion = 0.0;
        
        for (Integer value: arr) {
            if (value > 0) {
                quantityPositives++;
            } else if (value < 0) {
                quantityNegatives++;
            } else {
                quantityNeutral++;
            }
        }
        
        positiveProportion = quantityPositives / arr.size();
        negativeProportion = quantityNegatives / arr.size();
        neutralProportion = quantityNeutral / arr.size();
        
        System.out.printf("%.6f%n", positiveProportion);
        System.out.printf("%.6f%n", negativeProportion);
        System.out.printf("%.6f%n", neutralProportion);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int N = scanner.nextInt(); // Number of chains
            int M = scanner.nextInt(); // Length of each chain
            
            long[] sums = new long[N];
            long[] maxValues = new long[N];

            // Read values and compute sums and max for each chain
            for (int i = 0; i < N; i++) {
                long sum = 0;
                long max = Long.MIN_VALUE;

                for (int j = 0; j < M; j++) {
                    int value = scanner.nextInt();
                    sum += value;
                    if (value > max) {
                        max = value;
                    }
                }

                sums[i] = sum;
                maxValues[i] = max;
            }

            // Calculate the total of all chains and the overall maximum value
            long totalSum = 0;
            long overallMax = Long.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                totalSum += sums[i];
                if (maxValues[i] > overallMax) {
                    overallMax = maxValues[i];
                }
            }

            // The diameter can be computed as follows
            long diameter = totalSum + overallMax * (N - 1);
            System.out.println(diameter);
        }

        scanner.close();

	}
}

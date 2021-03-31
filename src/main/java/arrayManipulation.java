import java.util.Arrays;
import java.util.Scanner;

public class arrayManipulation {
    /* Starting with a 1-indexed array of zeros and a list of operations,
     for each operation add a value to each the array element between two given indices, inclusive.
    Once all operations have been performed, return the maximum value in the array.
    Complete the function arrayManipulation in the editor below.

arrayManipulation has the following parameters:

int n - the number of elements in the array
int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
Returns

int - the maximum value in the resultant array
Input Format

The first line contains two space-separated integers  and , the size of the array and the number of operations.
Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        int sizeOfMatrix = input[0];
        int numberOfOperation = input[1];

        int[][] matrix = new int[numberOfOperation][numberOfOperation];


        for (int i = 0; i < numberOfOperation; i++) {
            String[] inputLines = scanner.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                int value = Integer.parseInt(inputLines[j]);
                matrix[i][j] = value;
            }
        }

        long maximumValue = takeMaximumValue(sizeOfMatrix, matrix);

        System.out.println(maximumValue);

    }

    private static long takeMaximumValue(int n, int[][] queries) {
        long maxSum = 0;
        long sum = 0;

        long[] matrix = new long[n+1];
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];

            matrix[a - 1] += k;
            matrix[b] += k * -1;
        }
            for (int j = 0; j <= n; j++) {

                sum += matrix[j];

                matrix[j] = sum;

                if (sum > maxSum){
                    maxSum = sum;
                }


            }
        return maxSum;

    }
}
import java.util.Arrays;
import java.util.Scanner;

public class array_hourglass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[6][6];


        for (int i = 0; i < matrix.length; i++) {
            int[] values = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < matrix[0].length; j++) {
                int number = values[j];
                matrix[i][j] = number;
            }
        }
        int row = 6;
        int col = 6;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < row -2 ; i++) {
            for (int j = 0; j < col - 2; j++) {
                int sum = (matrix[i][j]+matrix[i][j+1]
                        +matrix[i][j+2])
                        + (matrix[i+1][j+1])
                        +(matrix[i+2][j] + matrix[i+2][j+1]
                        + matrix[i+2][j+2]);

                maxSum = Math.max(maxSum,sum);
            }
        }

        System.out.println(maxSum);
    }
}

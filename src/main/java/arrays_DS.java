import java.util.Arrays;
import java.util.Scanner;

public class arrays_DS {

    //Given a 6*6 2D Array arr:
    //1 1 1 0 0 0
    //0 1 0 0 0 0
    //1 1 1 0 0 0
    //0 0 0 0 0 0
    //0 0 0 0 0 0
    //0 0 0 0 0 0
    //We define an hourglass to be a subset of values with indices falling in this pattern in arr‘s graphical representation:
    //a b c
    //  d
    //e f g
    //There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass’ values. Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] output = new int[n];
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            output[j] = numbers[i];
            j++;

        }
        System.out.print(Arrays.toString(output));


    }
}

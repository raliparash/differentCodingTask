import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps2 {
    //You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.
    //
    //For example, given the array  we perform the following steps:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        int[] unorderedNumbers = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        int minimumNumberOfSwaps = takeMinimumNumberOfSwaps(unorderedNumbers);
        System.out.println(minimumNumberOfSwaps);

    }

    private static int takeMinimumNumberOfSwaps(int[] arr) {

        int countSwaps = 0;

        int tempElements = 0;
        int index = 0;

        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int cycle = 0;
            index = i;
            while (!visited[index]){
                visited[index] = true;
                index = arr[index]-1;
                cycle++;
            }
            if (cycle!=0){
                countSwaps+= cycle-1;
            }
        }
        return countSwaps;
    }
}

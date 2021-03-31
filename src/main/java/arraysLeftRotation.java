import java.util.Arrays;
import java.util.Scanner;

public class arraysLeftRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] sizeAndNumberOfRotation = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int sizeOfArray = sizeAndNumberOfRotation[0];
        int numberOfRotation = sizeAndNumberOfRotation[1];

        int [] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int [] outputArray = takeLeftRotation(sizeAndNumberOfRotation[1],array);

        System.out.println(Arrays.toString(outputArray));
    }

    private static int[] takeLeftRotation(int d, int[] a) {

        int size = a.length;
        int [] resultArray = new int[size];

        while (d-- > 0){

            int right = a[0];
            for (int j = 0; j < a.length-1; j++) {

                resultArray[j] = a[j+1];
            }
            resultArray[resultArray.length-1] = right;

            a = resultArray;
        }
        return resultArray;
    }
}

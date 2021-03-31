import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class minimumStepsToSordListInAscendingOrder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        List<Integer> unorderedNumbers = new ArrayList<>();

        unorderedNumbers.add(5);
        unorderedNumbers.add(1);
        unorderedNumbers.add(3);
        unorderedNumbers.add(2);


        int minimumNumberOfSwaps = takeMinimumNumberOfSwaps(unorderedNumbers);
        System.out.println(minimumNumberOfSwaps);

    }

    private static int takeMinimumNumberOfSwaps(List<Integer> arr) {
        int count = 0;

        int [] temporary = new int[arr.size()];

        temporary[arr.size()-1] = arr.get(arr.size()-1);

        for (int i = arr.size()-2; i >=0 ; i--) {
            temporary[i] = Math.min(temporary[i+1],arr.get(i));
        }

        int maxMove = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > maxMove){
                count++;
            }else if (arr.get(i) > temporary[i]){

                count++;
                maxMove = arr.get(i);
            }
        }


        return count;

    }
}


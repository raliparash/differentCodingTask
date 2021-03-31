import java.util.*;
import java.util.stream.Collectors;

public class countTriplets {

    //   You are given an array and you need to find number of tripets of indices  such that the elements at those indices are in geometric progression for a given common ratio  and .
    //   
    //   For example, . If , we have  and  at indices  and .
    //   
    //   Function Description
    //   
    //   Complete the countTriplets function in the editor below. It should return the number of triplets forming a geometric progression for a given  as an integer.
    //   
    //   countTriplets has the following parameter(s):
    //   
    //   arr: an array of integers
    //   r: an integer, the common ratio

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long [] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong).toArray();

        long sizeOfArray = input[0];
        long commonRatio = input[1];

        List<Long> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Long::parseLong).collect(Collectors.toList());

        long countOfTriplets = takeCountOfTriplets(numbers, commonRatio);
        System.out.println(countOfTriplets);
    }

    private static long takeCountOfTriplets(List<Long> arr, long r) {

        Long[] array = new Long[arr.size()];
        HashMap<Long,Long> right= new HashMap<>();
        HashMap<Long, Long>left = new HashMap<>();

        long count = 0;


        for (int i = 0; i < arr.size(); i++) {

            array[i] = arr.get(i);
            right.put(array[i],0L);
            left.put(array[i],0L);
        }
        for (int i = 0; i < array.length; i++) {

            Long num = array[i];
            right.put(num, right.get(num) + 1);
        }
        for (int i = 0; i < array.length; i++) {
             Long secondNum = array[i];
             right.put(secondNum,right.get(secondNum)-1);

             if (secondNum % r == 0){
                 Long num1 = secondNum / r;
                 Long num3 = secondNum *r;

                 if (left.containsKey(num1) && right.containsKey(num3)){
                     count+= (left.get(num1)) * right.get(num3);
                 }
             }
             left.put(secondNum, left.get(secondNum)+1);
        }

        return count;
    }

}

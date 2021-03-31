


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class dynamicArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // int [] numbers = Arrays.stream(scanner.nextLine()
        //         .split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int size = scanner.nextInt();
        int numberOfQueries = scanner.nextInt();




        ArrayList<ArrayList<Integer>> values = new ArrayList<>(numberOfQueries);


        for (int i = 0; i < numberOfQueries; i++) {
            values.add(new ArrayList<>());
        }
        int lastAnswer = 0;
            for (int i = 0; i < numberOfQueries; i++) {
                int query = scanner.nextInt();
                int index = scanner.nextInt();
                int element = scanner.nextInt();
                List<Integer> result = values.get((index ^ lastAnswer) % size);

                switch (query) {
                    case 1:
                        result.add(element);
                        break;
                    case 2:
                        lastAnswer = result.get(element % result.size());
                       result.add(lastAnswer);
                        break;
                }
            }

        System.out.println(values.size());
        System.out.println(values.get(0).size());


    }
}

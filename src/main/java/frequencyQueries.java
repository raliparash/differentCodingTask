import java.util.*;
import java.util.stream.Collectors;

public class frequencyQueries {
    //You are given  queries. Each query is of the form two integers described below:
    //-1 x  : Insert x in your data structure.
    //- 1 y : Delete one occurence of y from your data structure, if present.
    //- 1 z  : Check if any integer is present whose frequency is exactly . If yes, print 1 else 0.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // int numberOfQueries = Integer.parseInt(scanner.nextLine());

        //ArrayList<ArrayList<Integer> > queries
        //        = new ArrayList<ArrayList<Integer> >();

        List<List<Integer>> queries = Arrays.asList(

                Arrays.asList(3, 2),
                Arrays.asList(1, 4),
                Arrays.asList(1, 5),
                Arrays.asList(1, 5),
                Arrays.asList(1, 4),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4),
                Arrays.asList(3, 2)


        );

        List<Integer> answer = takeFrequency(queries);
        System.out.println(Arrays.toString(answer.toArray()));


    }

    private static List<Integer> takeFrequency(List<List<Integer>> queries) {

       HashMap<Integer, Integer> countFrequency = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

       int size = queries.size();

        for (int i = 0; i < size; i++) {
            List<Integer> values = queries.get(i);
            int operation = values.get(0);
            int value = values.get(1);

            if (operation == 1) {
                if (!countFrequency.containsKey(value)) {
                    countFrequency.put(value, 1);
                } else {
                    countFrequency.put(value, countFrequency.get(value) + 1);
                }
            }else if (operation ==2) {
                if (countFrequency.containsKey(value) && countFrequency.get(value) > 1) {
                    countFrequency.put(value, countFrequency.get(value) - 1);
                } else if (countFrequency.containsKey(value) && countFrequency.get(value) == 1)
                    countFrequency.remove(value);
            }else if (operation==3){
                if (value > size){
                    answer.add(0);
                }else {
                    ArrayList<Integer> result = new ArrayList<>(countFrequency.values());

                    if (result.contains(value)){
                        answer.add(1);
                    }else {
                        answer.add(0);
                    }
                }
            }
        }


        return answer;
    }
}



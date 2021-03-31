import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class twoStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        while (number-- > 0) {
            String first = scanner.nextLine();
            String second = scanner.nextLine();

            int countSymbol = 0;

            String output = takeTwoStrings(first, second);
            System.out.println(output);

        }
    }

    private static String takeTwoStrings(String s1, String s2) {
        int countSymbol = 0;

      String [] array1 = s1.split("");
      String [] array2 = s2.split("");

        Set<String> first = new HashSet<>();
        Collections.addAll(first,array1);

        Set<String> second = new HashSet<>();
        Collections.addAll(second,array2);

        boolean result = Collections.disjoint(first,second);

        if (result){
            return "No";
        }else {
            return "Yes";
        }
    }
    // another decision:
// char[] charArray1 = s1.toCharArray();
// HashSet<Integer> str1 = new HashSet<Integer>();
//		for (char c : charArray1) {
//     str1.add((int) c);
// }
//		for (char c : s2.toCharArray()) {
//     if (str1.contains((int) c)) {
//         return "YES";
//     }
// }
//		return "NO";
}


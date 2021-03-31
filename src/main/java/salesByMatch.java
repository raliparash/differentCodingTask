import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class salesByMatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] colorOfSocks = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int pairs = 0;
        int firstSock = 0;

        Arrays.sort(colorOfSocks);

        while (firstSock < n) {

            int first = colorOfSocks[firstSock];
             int countSock =1;
             firstSock++;

             while (firstSock < n && colorOfSocks[firstSock]== first){

                countSock++;
                 firstSock++;
             }

             if (countSock % 2 ==0){
                 countSock = countSock/2;
                 pairs = pairs + countSock;
             }else if (countSock % 2 == 1){

                 countSock = countSock -1;
                 if (countSock == 0){
                     continue;
                 }
                 countSock = countSock/2;
                 pairs = pairs + countSock;
             }



        }


        System.out.println(pairs);
    }
}

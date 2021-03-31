import java.util.Arrays;
import java.util.Scanner;

public class jumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalNumberOfClouds = Integer.parseInt(scanner.nextLine());
        int[] clouds = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();



        int minimumSteps = countMinimumSteps(clouds);

        System.out.println(minimumSteps);
      
            }

    private static int countMinimumSteps(int[] c) {
        int minimumCountOfSteps = 0;
        int startStep =0;

        while (startStep < c.length-1){
            if (startStep+2 < c.length && c[startStep+2] != 1){
                minimumCountOfSteps++;
                startStep = startStep +2;
            }else {
                minimumCountOfSteps++;
                startStep++;
            }
        }

        return minimumCountOfSteps;
    }
}



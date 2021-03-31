
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class newYearChaos {
 //It’s New Year’s Day and everyone’s in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by 1 from 1 at the front of the line to at n the back.
 //Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if n = 8 and person 5 bribes person 4, the queue will look like this: 1, 2, 3, 5, 4, 6, 7, 8.
 //Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!
 //Function Description
 //Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.
 //minimumBribes has the following parameter(s):
 //q: an array of integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());


        int[] input = new int[]{2, 1, 5, 3, 4};



        int currentCount = 0;


        int swap =0;
        int bribes = 0;
        int count = 0;

        for(int i = input.length-1; i>=0; i--){

            int j = 0;

            bribes = input[i] - (i+1);

            if(bribes > 2){
                System.out.println("Too chaotic");
                return;
            }
            if(input[i] - 2 > 0){
                j= input[i] - 2;
            }

            while(j <= i){
                if(input[j] > input[i]){
                    swap++;
                }
                j++;
            }
            count++;
        }
        System.out.println(swap);
        }


}

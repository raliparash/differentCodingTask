import java.util.Scanner;

public class countingValleys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        String path = scanner.nextLine();


        int startStep = 0;
        int upCount = 0;
        int countValley = 0;

        while (steps > 0) {
            for (int i = 0; i < path.length(); i++) {
                char symbol = path.charAt(i);

            if (symbol == 'U') {
                upCount++;
                if (upCount == 0) {
                    countValley++;
                }
            } else if (symbol == 'D') {
                upCount--;

            }
            steps--;
            startStep++;
        }
        }

        System.out.println(countValley);
    }
}

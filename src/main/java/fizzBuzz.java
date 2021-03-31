import java.util.Scanner;

public class fizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            if (i% 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i% 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}

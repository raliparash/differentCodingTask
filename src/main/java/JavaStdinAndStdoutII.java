import java.util.Scanner;

public class JavaStdinAndStdoutII {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer =scanner.nextInt();
        double numberDouble =scanner.nextDouble();
        scanner.nextLine();
        String stringValue =scanner.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + numberDouble);
        System.out.println("Int: " + integer);
    }
}

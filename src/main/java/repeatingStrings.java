import java.util.Scanner;

public class repeatingStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        int numberOfRepeatedCharacter = Integer.parseInt(scanner.nextLine());


        int size = input.length();
        int frequencyOfChars = numberOfRepeatedCharacter /size;
        int reminder = numberOfRepeatedCharacter % size;


     long charCount = countASymbolInInput(input,numberOfRepeatedCharacter);

        System.out.println(charCount);

        }

    private static long countASymbolInInput(String s, long n) {

       long size = s.length();
        long frequencyOfChars = n /size;
        long reminder = n % size;
        long charCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);

            if (symbol == 'a'){
                charCount++;
            }

        }
        charCount = charCount * frequencyOfChars;

        for (int i = 0; i < reminder; i++) {
            char symbol = s.charAt(i);
            if (symbol == 'a'){
                charCount++;
            }

        }


        return charCount;
    }

}

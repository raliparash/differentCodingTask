import java.util.*;

public class hashTablesRansomNote {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] sizeOfMagazineSizeOfNote = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sizeOfMagazine = sizeOfMagazineSizeOfNote[0];
        int sizeOfNote = sizeOfMagazineSizeOfNote[1];
        String[] magazine = scanner.nextLine().split(" ");
        String[] note = scanner.nextLine().split(" ");

        checkIfTheNoteExist(magazine, note);
    }

    private static void checkIfTheNoteExist(String[] magazine, String[] note) {
        Map<String, Integer> noteWords = new LinkedHashMap<>();

        int noteSize = note.length;
        int wordCount = 0;
        if (note.length > magazine.length) {
            System.out.println("No");
            return;
        }

        for (String word : magazine) {
            if (!noteWords.containsKey(word)) {
                noteWords.put(word, 1);
            } else {
                noteWords.put(word, noteWords.get(word) + 1);
            }
        }

            for (String noteWord : note) {
                if (!noteWords.containsKey(noteWord)) {
                    System.out.println("No");
                    return;
                }else {
                    if (noteWords.get(noteWord) > 0){
                        noteWords.put(noteWord,noteWords.get(noteWord)-1);
                    }else {
                        System.out.println("No");
                        return;
                    }
                }

    }
        System.out.println("Yes");
    }
}


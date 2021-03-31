import com.sun.tools.jdeprscan.scan.Scan;
import sun.tools.jstat.Scale;

import java.util.*;

public class websitePagination {
    //

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<String>> items = Arrays.asList(
                Arrays.asList("owjevtkuJv", "58584272", "62930912"),
                Arrays.asList("rpaqgbjxik", "9425650", "96088250"),
                Arrays.asList("dfbkasyqcu", "37469674", "46363902"),
                Arrays.asList("vjrrisdfxe", "18666489", "88046739"));

        int sortParameter = Integer.parseInt(scanner.nextLine());
        int sortOrder = Integer.parseInt(scanner.nextLine());

        int itemsPerPage = Integer.parseInt(scanner.nextLine());

        int pageNumber = Integer.parseInt(scanner.nextLine());

        List<String> fetchedItemsToDisplay = fetchItemsToDisplay(items, sortParameter, sortOrder, itemsPerPage, pageNumber);

        System.out.println(Arrays.toString(fetchedItemsToDisplay.toArray()));


    }

    private static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {


        List<String> result = new ArrayList<>();
        switch (sortOrder) {
            case 0:

                Comparator<List<String>> ascending = new Comparator<List<String>>() {
                    @Override
                    public int compare(List<String> o1, List<String> o2) {
                        return o1.get(sortParameter).compareTo(o2.get(sortParameter));
                    }
                };

                Collections.sort(items,ascending);
                break;
            case 1:

                Comparator<List<String>> comparator = new Comparator<List<String>>() {
                    @Override
                    public int compare(List<String> o1, List<String> o2) {
                        return o2.get(sortParameter).compareTo(o1.get(sortParameter));
                    }
                };

                Collections.sort(items,comparator);
                break;
        }

        int index = 0;
        for (int i = pageNumber; i < itemsPerPage; i++) {
            result.add(items.get(i).get(index));
        }

        return result;
    }
}

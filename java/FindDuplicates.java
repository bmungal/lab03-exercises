import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        // replace "return null" with your code:

        // alternate idea is to set flag
        List<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < l.size(); i++) {
            // bool flag = false;
            // add && condition in nested for && !flag
            for (int j = i + 1; j < l.size() && !duplicates.contains(l.get(i)); j++) {
                if (l.get(i) == l.get(j)) {
                    duplicates.add(l.get(i));
                    // flag = true;
                    // break;
                }
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}
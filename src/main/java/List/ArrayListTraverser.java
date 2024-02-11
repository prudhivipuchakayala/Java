package List;


import java.util.ArrayList;

public class ArrayListTraverser {

    public static void traverseWithForLoop(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void traverseWithEnhancedForLoop(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }
}

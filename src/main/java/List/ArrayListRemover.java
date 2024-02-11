package List;


import java.util.ArrayList;

public class ArrayListRemover {

    public static void removeLastObject(ArrayList<Object> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }
}


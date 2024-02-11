package List;


import java.util.ArrayList;

public class ArrayListConverter {

    public static String[] convertToArray(ArrayList<String> list) {
        String[] array = new String[list.size()];
        return list.toArray(array);
    }
}


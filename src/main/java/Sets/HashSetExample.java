package Sets;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static HashSet<String> createAndPopulateHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("date");
        set.add("elderberry");
        set.add("fig");
        set.add("grape");
        set.add("honeydew");
        set.add("kiwi");
        set.add("lemon");
        return set;
    }
}

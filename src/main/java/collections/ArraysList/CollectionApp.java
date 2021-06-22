package collections.ArraysList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        List<String> states = new ArrayList<>();
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Испания");

        Iterator<String> iter = states.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}


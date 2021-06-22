package collections.ArraysList;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        List test1 = new ArrayList<>();
        test1.add("12345");
        test1.add("23345");
        test1.add("34567");
        test1.add("456789");
        test1.add("6753424");

        for (Object s : test1) {
//            System.out.println(test1);
        }
        Set set = new HashSet();
        for (int i = 10; i > 1; i--) {
            set.add(" " + i);
        }
        for (Object s : set) {
            System.out.println(s);
        }
    }

}

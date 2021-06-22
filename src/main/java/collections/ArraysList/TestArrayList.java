package collections.ArraysList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(1);
        }
        long t = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
        System.out.println("Time: " + (System.currentTimeMillis() - t));
    }
}

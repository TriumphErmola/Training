package collections;

import java.util.HashSet;

public class TestBox {
    public static void main(String[] args) {

        HashSet<Box> hashSet= new HashSet<>();
        hashSet.add(new Box(10,18));
        hashSet.add(new Box(9,16));
        hashSet.add(new Box(10,18));
        hashSet.add(new Box(13,13));
        hashSet.add(new Box(10,12));
        hashSet.add(new Box(9,16));

        System.out.println(hashSet);
    }
}

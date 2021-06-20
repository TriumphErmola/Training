package collections;

import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        SortedSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Свекла");
        treeSet.add("Огурцы");
        treeSet.add("Помидоры");
        treeSet.add("Картофель");
        treeSet.add("Морковь");
        // Данная запись не должна попасть в набор
        treeSet.add("Картофель");

// Вывести в консоль размер набора
        System.out.println("Размер treeSet = " + treeSet.size());

        // Вывести в консоль записи
        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }

        Random random = new Random(30);
        SortedSet<Integer> iset = new TreeSet<Integer>();

        for (
                int i = 0;
                i < 25; i++)
            iset.add(random.nextInt(10));

        // Вывести в консоль записи
        Iterator<Integer> itr1 = iset.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next().toString());
        }
    }

}

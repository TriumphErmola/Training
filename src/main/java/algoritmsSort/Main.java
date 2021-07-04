package algoritmsSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] arrayToSort = {2, 4, 1, 5, 7, 3, 8, 6, 9, 11, 25, 23, 14, 10, 17, 19,};
        System.out.println(Arrays.toString(arrayToSort));
        choiceSort(arrayToSort);
        bubbleSort(arrayToSort);
        insertSort(arrayToSort);
    }

    public static void choiceSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();
        int indexMin;

        for (int index = 0; index < array.length - 1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < array.length; indexToScan++) {
                if (array[indexMin] > array[indexToScan]) {
                    indexMin = indexToScan;
                }
            }

            int temp = array[index];
            array[index] = array[indexMin];
            array[indexMin] = temp;

        }
        long stop = System.nanoTime();
        System.out.println("Выборка : " + (stop - start));
        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        long start = System.nanoTime();

        int changeCounter;

        do {
            changeCounter = 0;
            for (int index = 0; index < arrayToSort.length - 1; index++) {

                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    changeCounter++;

                }

            }
        } while (changeCounter > 0);
        long stop = System.nanoTime();
        System.out.println("Пузырьком : " + (stop - start));
        System.out.println(Arrays.toString(arrayToSort));
    }

    public static void insertSort(int[] arrayToSort) {
        int[] array = Arrays.copyOf(arrayToSort, arrayToSort.length);
        int element;
        int indexToInsert;
        long start = System.nanoTime();

        for (int index = 0; index < array.length; index++) {
            element = array[index];
            indexToInsert = index;

            while (indexToInsert > 0 && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
        long stop = System.nanoTime();
        System.out.println("Вставкой : " + (stop - start));
        System.out.println(Arrays.toString(array));
    }
}

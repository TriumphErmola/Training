package loopfor;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
    }

}

package initizialization.this154;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Конструктор с параметром int, petalCount= " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Конструктор с параметром String, s= " + ss);
        s = ss;
    }

    Flower(int petals, String s) {
        this(petals);
        this.s = s;
        System.out.println("Аргументы String и int");
    }
    Flower() {
        this(47,"hi");
        System.out.println("Конструктор по умолчанию ( без аргументов )");
    }
    void printPetalCount() {
        System.out.println("petalCount = " + petalCount + " s " + s);

    }

    public static void main(String[] args) {
        Flower f = new Flower();
        f.printPetalCount();
    }
}

package initizialization.this154;

public class OverloadingConstructor {
    int a = 10;
    String b = "Хорошо";

    public OverloadingConstructor(int a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("Конструктор с двумя параметрами");
    }

    public OverloadingConstructor() {
        this(52,"Круто");
        System.out.println("a = " + a + " String = " + b);
    }

    public static void main(String[] args) {
        new OverloadingConstructor();
    }
}

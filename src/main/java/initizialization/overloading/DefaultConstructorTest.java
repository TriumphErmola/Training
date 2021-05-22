package initizialization.overloading;

public class DefaultConstructorTest {
    public static void main(String[] args) {
        TestCons testCons = new TestCons();
        TestCons testCons1 = new TestCons("Перегрузка ");
    }
}

class TestCons {
    TestCons() {
        System.out.println("Cоздайте объект этого класса");
    }

    TestCons(String s) {
        System.out.println(s + "Cоздайте объект этого класса");
    }
}



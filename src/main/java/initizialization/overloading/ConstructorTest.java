package initizialization.overloading;

public class ConstructorTest {
    public static void main(String[] args) {
        Tester tester = new Tester();
        System.out.println("tester.s1 = " + tester.s1);
        System.out.println("tester.s2 = " + tester.s2);
        System.out.println("tester.s3 = " + tester.s3);
    }
}

class Tester {
    String s1;
    String s2 = "hello";
    String s3;

    Tester(){
        s3 = "good-buy";
    }
}

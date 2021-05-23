package initizialization.this154;

public class TestThis {
    public static void main(String[] args) {
    new TestThis2().thistest2();

    }


}

class TestThis2 {
    void thistest(){
        System.out.println("testthis");
    }

    void thistest2(){
        System.out.println("2x");
        thistest();
        this.thistest();
    }
}
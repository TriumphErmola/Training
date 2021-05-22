package initizialization.overloading;

public class DogTalk {
    public static void main(String[] args) {
        Dog dog = new Dog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        dog.bark();
        dog.bark((char) c);
        dog.bark((byte) b);
        dog.bark((short) s);
        dog.bark(1);
        dog.bark(1L);
        dog.bark(1.0f);
        dog.bark(1.0);
    }

    public static class Dog {

        void bark() {
            System.out.println("quiet");
        }

        void bark(char c) {
            System.out.println("cawcaw");
        }

        void bark(byte b) {
            System.out.println("barkbark");
        }

        void bark(short s) {
            System.out.println("slurpslurp");
        }

        void bark(int i) {
            System.out.println("iyow");
        }

        void bark(long L) {
            System.out.println("lalala");
        }

        void bark(float f) {
            System.out.println("fififoofum");
        }

        void bark(double d) {
            System.out.println("dodo");
        }
    }
}

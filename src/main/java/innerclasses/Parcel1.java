package innerclasses;

//создание внутренних классов
public class Parcel1 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readlabel() {
            return label;
        }
    }

    //Использование внутренних классов очень похоже
    // на исп. любых других классов, в пределах Parcel1:
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readlabel());
    }

    public static void main(String[] args) {
        Parcel1 p1 = new Parcel1();
        p1.ship("Танзания");
    }


}

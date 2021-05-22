package initizialization.overloading;
//Перегрузка это когда одинаковые имена и разные аргументы.
public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
          Tree derevo = new Tree(i);
          derevo.info();
          derevo.info("Перегруженный метод");
        }
        //Перегруженный конструктор
        new Tree();
    }
}

class Tree {
    int height;

    Tree() {
        System.out.println(" Сажаем росток ");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println(" Создание нового дерева высотой : " + height + " метров. ");
    }

    void info() {
        System.out.println(" Дерево высотой " + height + " метров. ");
    }

    void info(String s) {
        System.out.println(s + " Дерево высотой " + height + " метров. ");
    }
}

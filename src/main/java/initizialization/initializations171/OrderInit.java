package initizialization.initializations171;

class Window {
    Window(int marker) {
        System.out.println("Window+(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);// перед конструктором

    House() {
        System.out.println("House()");
        w3 = new Window(33);// повторная инициализация w3
    }

    Window w2 = new Window(2); //после конструктора

    void f() {
        System.out.println("f()");

    }
    Window w3 = new Window(3);// в конце
}


public class OrderInit {
    public static void main(String[] args) {
        House h = new House();
        h.f();// показывает что объект сконструирован.
    }

}

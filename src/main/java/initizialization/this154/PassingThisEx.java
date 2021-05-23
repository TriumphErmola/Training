package initizialization.this154;

public class PassingThisEx {
    public static void main(String[] args) {
        new Doc().intubate();
    }
}

class Doc {
    void intubate() {
        System.out.println("prepare patient");
        laryngoscopy();
        this.laryngoscopy();
    }

    void laryngoscopy() {
        System.out.println("use laryngoscope");
    }
}

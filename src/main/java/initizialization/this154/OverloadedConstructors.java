package initizialization.this154;

public class OverloadedConstructors {
    public static void main(String[] args) {
        new Doc(11).intubate();
    }


    static class Doc {
        Doc(int i) {
            this("dsad");
            int yearsTraining = 1;
            System.out.println("New doc with " + i + " years of training");
        }

        Doc(String s) {
            String degree = s;
            System.out.println("New doc with" + s + " degree");
        }

        void intubate() {
            System.out.println("prepare patient");
            laryngoscopy();
        }

        void laryngoscopy() {
            System.out.println("use laryngoscopy");
        }
    }
}



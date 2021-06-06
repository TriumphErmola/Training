package myclass;

public class MyClass {
    public static void main(String[] args) {

        Person p = new Person("Andrey", "Omsk", 27);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);

        Person[] p_array = new Person[3];
        p_array[0] = new Person("Igor", "Orsk", 25);
        p_array[1] = new Person("Denis", "Krasnoyarsk", 22);
        p_array[2] = new Person("Igor", "Orenburg", 35);
//        for (int i = 0; i < p_array.length; i++) {
//            System.out.println(p_array[i].name + " " + p_array[i].city + " " + p_array[i].age);
//        }
        for(Person temt : p_array) {
            System.out.println(temt.name + " " + temt.city + " " + temt.age);
        }
    }
}

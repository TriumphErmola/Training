package loopfor;

public class Phrasegeneration {
    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "выбираемый", "трех-звенный",
                "30000-футовый", "взаимный", "обоюдно-острый", "лютый"};
        String[] wordListTwo = {"сварщик", "довен", "космодесантник",
                "хаосит", "гвардеец", "кустодий"};
        String[] wordListThree = {"процесса", "уничтожения",
                "развития", "мучения", "совершенный", "невероятный","придаватель"};


        //Вычисляем сколько символов в каждом массиве
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        //Генерируем 3 случайных числа
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё что вам нужно знать об этой наркомании : " + phase);


    }
}

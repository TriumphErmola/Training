package collections.ArraysList;

import java.util.Scanner;

public class ListRunner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Please enter a task to add");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Print out TO DO LIST");
                    list.printToDOList();
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Please enter item to update");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.println("Please enter a new task");
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Please enter a task to remove");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    list.removeTask(task4);
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                case 5:
                    //12-45
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Please choose an action by typing [0-6");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }


    }


    private static void printOut() {
        System.out.println("Please choose an action. Press : \n");
    }
}

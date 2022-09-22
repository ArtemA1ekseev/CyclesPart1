package homework1;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1. Задание 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 1. Задание 2.");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 1. Задание 3.");
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0){
                System.out.println("Четное числов в цикле (от 0 до 17): " + i);
            }
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 1. Задание 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
    }
}

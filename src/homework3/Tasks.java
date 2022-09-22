package homework3;

public class Tasks {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3. Задание 1.");
        int Salary = 29000;
        int Total = 0;
        for (int i = 1; i <= 12; i++) {
            Total = Total + Salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total + " рублей.");
        }
        System.out.println(" ");
        System.out.println("Домашнее задание - 3. Задание 2.");
        int Salary1 = 29000;
        int Total1 = 0;
        for (int i = 1; i <= 12; i++) {
            Total1 = Total1 + Total1/100;
            Total1 = Total1 + Salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + Total1 + " рублей.");
        }
    }
}

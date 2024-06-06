package by.vika.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Введите температуру ");
        Scanner inputInt = new Scanner(System.in);
        int i = inputInt.nextInt();
        if (i < 3) {
            System.out.println("А холодно однако!");
        } else if (i >= 0 && i <= 16) {
            System.out.println("Сейчас прохладно");
        } else {
            System.out.println("Хороший летний денек");
        }

        System.out.println("-------------------------------------------");

        System.out.print("Введите целое число");
        Scanner evenInt = new Scanner(System.in);
        int n = evenInt.nextInt();

        String result = (n % 2 == 0) ? "Число четное" : "Число нечетное";
        System.out.println(result);

        System.out.println("------------------------------");

        enum Day {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}
        Day day = Day.SUNDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Будний день");
                break;
            case TUESDAY:
                System.out.println("Будний день");
                break;
            case WEDNESDAY:
                System.out.println("Будний день");
                break;
            case THURSDAY:
                System.out.println("Будний день");
                break;
            case FRIDAY:
                System.out.println("Будний день");
                break;
            case SATURDAY:
                System.out.println("Выходной день");
                break;
            case SUNDAY:
                System.out.println("Выходной день");
                break;

            default:
                System.out.println("Сейчас другой день");
                break;
        }
        System.out.println("------------------------------");
        i = 1;
        while (i < 513) {
            System.out.println(i);
            i = i*2;
        }
        System.out.println("------------------------------");
        n = 1;
        do {
            System.out.println(n);
            n = n *2;
        } while (n < 513);


        System.out.println("----------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int l = scanner.nextInt();

        long factorial = 1; // Используем long для хранения больших значений факториала

        for (int m = 1; m <= l; m++) {
            factorial *= m;
        }

        System.out.println("Факториал числа " + l + " равен " + factorial);

        scanner.close();
    }
}
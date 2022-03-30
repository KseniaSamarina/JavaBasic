package JavaBasic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Пожалуйста, введите первое число");
                float x = console.nextInt();
                System.out.println("Пожалуйста, введите второе число");
                float y = console.nextInt();
                System.out.println("Пожалуйста, введите символ арифметической операции");
                char z = console.next().charAt(0);

                if (z == '+') {
                    System.out.println("Сумма = " + (x + y));
                } else if (z == '-') {
                    System.out.println("Разность = " + (x - y));
                } else if (z == '*') {
                    System.out.println("Произведение = " + (x * y));
                } else if (z == '/') {
                    System.out.println("Частное от деления = " + (float)(x / y));
                } else {
                    System.out.println("Введён несуществующий символ");
                }
            } catch (Exception e) {
                System.err.println("Введена неизвестная команда");
            }
            System.out.println("Вы хотите продолжить(y/n)?");
            char m = console.next().charAt(1);
            if (console.next().equals("n")) {
                break;
            }
        }
    }
}



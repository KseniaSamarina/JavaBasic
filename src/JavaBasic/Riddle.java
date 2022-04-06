package JavaBasic;

import java.util.Objects;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        String answer;
        System.out.println("Отгадайте загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner inputAnswer = new Scanner(System.in);

        int attemptsCount = 3;
        boolean hintUsed = false;

        do {
            System.out.println("Попыток - " + attemptsCount);
            System.out.println("Введи ответ:");
            answer = inputAnswer.nextLine();
            switch (answer) {
                case ("Заархивированный вирус") -> {
                    System.out.println("Правильно!");
                    attemptsCount = 0;
                }
                case ("Подсказка") -> {
                    if (attemptsCount == 3 && !hintUsed) {
                        System.out.println("Это точно не лук! Подумай ещё");
                        attemptsCount = 1;
                    } else {
                        System.out.println("Подсказка уже недоступна");
                    }
                    hintUsed = true;
                }
                default -> {
                    if (attemptsCount > 1) {
                        System.out.println("Подумай еще");
                    }
                    attemptsCount--;
                }
            }
        }
        while (attemptsCount > 0);
        System.out.println("Обидно, приходи в другой раз");
    }
}
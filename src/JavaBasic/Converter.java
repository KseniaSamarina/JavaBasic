package JavaBasic;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, выберите, что переводить: 1 - расстояние, 2 - масса");
        int one = console.nextInt();
        if (one == 1) {
            System.out.println("Пожалуйста, выберите еденицу измерения: 1 - метр, 2 - миля, 3 - ярд");
            int two = console.nextInt();
            {
                if (two == 1) {
                    System.out.println("Пожалуйста, введите количество едениц, которые хотите конвертировать");
                    float three = console.nextFloat();
                    System.out.println("Метры: " + three);
                    System.out.println("Мили: " + three * 0.000621371);
                    System.out.println("Ярды: " + three * 1.093613);
                    return;
                } else if (two == 2) {
                    System.out.println("Пожалуйста, введите количество едениц, которые хотите конвертировать");
                    float three2 = console.nextFloat();
                    System.out.println("Мили: " + three2);
                    System.out.println("Метры: " + three2 * 1609.34);
                    System.out.println("Ярды: " + three2 * 1760);
                    return;
                } else if (two == 3) {
                    System.out.println("Пожалуйста, введите количество едениц, которые хотите конвертировать");
                    float three3 = console.nextFloat();
                    System.out.println("Ярды: " + three3);
                    System.out.println("Метры: " + three3 * 0.91);
                    System.out.println("Мили: " + three3 * 0.00057);
                    return;
                } else {
                    System.out.println("Вы ввели некорректное значение");
                    return;
                }
            }
        }
        if (one == 2) {
            System.out.println("Пожалуйста, выберите еденицу измерения: 1 - килограммы, 2 - тонна");
            int izm = console.nextInt();
            {
                if (izm == 1) {
                    System.out.println("Пожалуйста, введите количество едениц, которые хотите конвертировать");
                    float col = console.nextFloat();
                    System.out.println("Килограмм: " + col);
                    System.out.println("Тонна: " + col * 0.001);
                    return;
                } else if (izm == 2) {
                    System.out.println("Пожалуйста, введите количество едениц, которые хотите конвертировать");
                    float col2 = console.nextFloat();
                    System.out.println("Тонна: " + col2);
                    System.out.println("Килограмм: " + col2 * 1000);
                    return;
                } else {
                    System.out.println("Вы ввели некорректное значение");
                    return;
                }
            }
        } else {
            System.out.println("Вы ввели некорректное значение");
        }
    }
}



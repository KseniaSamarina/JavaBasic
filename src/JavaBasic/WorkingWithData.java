package JavaBasic;

import java.util.Scanner;

public class WorkingWithData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите первое число");
        int num = console.nextInt();
        String result;
        result = Integer.toString(num);
        //System.out.println(result);
        System.out.println("Пожалуйста, введите второе число");
        int num2 = console.nextInt();
        double numDouble;
        if (num > num2) {
            System.out.println("Наибольшее число: " + num);
            numDouble = num2;
            System.out.println("Наименьшее число: " + numDouble);
        }
        if (num < num2) {
            System.out.println("Наибольшее число: " + num2);
            numDouble = num;
            System.out.println("Наименьшее число: " + numDouble);
        }
        else {
            System.out.println("Числа равны: " + num + " = " + num2);
        }
    }
}

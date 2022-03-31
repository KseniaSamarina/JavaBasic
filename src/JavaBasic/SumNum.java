package JavaBasic;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите любое целое положительное число");
        int n = console.nextInt();
        int result = 0;
        for (int i = 1; i < n; i+=2)
            result +=i;
            System.out.println("Результат всех нечётных чисел от 1 до " +n+ " = " + result);
    }
}

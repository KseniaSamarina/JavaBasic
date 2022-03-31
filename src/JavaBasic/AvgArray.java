package JavaBasic;

import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double[] array;
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        array = new double[size];
        int cursor = 0;
        do {
            System.out.println("Введите целое или дробное число");
            double num = console.nextDouble();
            array[cursor] = num;
            cursor++;
        } while (--size > 0);
        double average = 0;
        double sum = 0.0;
        for (double v : array) {
            sum += v;
        }
        average = sum/array.length;                             //Среднее арифметическое элементов массива
        for (double v : array) {
            System.out.println("Результат перемножения элементов = " +v * average);
        }
    }
}

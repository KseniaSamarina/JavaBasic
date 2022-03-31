package JavaBasic;

import java.util.Scanner;

public class ComparingArrayElements {
    public static void main(String[] args) {
        int x = 7;
        int y = 9;
        int z = 11;
        Scanner console = new Scanner(System.in);
        int[] array;
        System.out.println("Введите размер массива");
        int size = console.nextInt();
        array = new int[size];
        int cursor = 0;
        do {
            System.out.println("Введите число");
            int num = console.nextInt();
            array[cursor] = num;
            cursor++;
        } while (--size > 0);
        for (int i : array) {
            if(x == i | y == i | z == i) {
                System.out.println("Данное значение имеется в константах: " + i);
                return;
            }
        }
    }
}
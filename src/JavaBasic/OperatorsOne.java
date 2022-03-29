package JavaBasic;

import java.util.Scanner;

public class OperatorsOne {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();                                  //1. Пользователь вводит в консоль 3 числа
        float xyz = (float) (x+y+z)/3;
        System.out.println("Среднее арифметическое = " + xyz);      //2. Среднее арифметическое 3-х чисел
        float result = (float) Math.floor(xyz/2);                   //3. Деление среднего арифметического на 2 и округление в меньшую сторону
        if (result > 3) {
            System.out.println("Программа выполнена корректно");    //4.
        }
        else {
            System.out.println("Полученное число < 3");             //Расширила уловия для себя :)
        }
    }
}

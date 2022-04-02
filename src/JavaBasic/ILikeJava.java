package JavaBasic;

import java.util.Locale;

public class ILikeJava {
    public static void main(String[] args) {
        String str_Sample = "I like Java!!!";
        if (str_Sample.contains("Java") == true & str_Sample.startsWith("I like") == true & str_Sample.endsWith("!!!") == true) {
            System.out.println("Строка в верхнем регистре: " + str_Sample.toUpperCase());
        }
        str_Sample = str_Sample.replace('a', 'o');
        System.out.println("Подстрока: " + str_Sample.substring(7, 11));
    }
}

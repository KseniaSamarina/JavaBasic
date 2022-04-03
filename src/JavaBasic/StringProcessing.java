package JavaBasic;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Пожалуйста, введите произвольную строку, используя английские и русские слова");
        String x = console.nextLine();
        String y = x.replaceAll("[^a-zA-Zа ]", "");
        System.out.println(y);
        int count = 0;
        if (y.length() != 0) {
            count++;
            for (int i = 0; i < y.length(); i++) {
                if (x.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}


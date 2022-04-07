package JavaBasic;

import java.util.Scanner;

public class TheEquation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите уравнение длинной 5 символов. Цифры от 0 до 9.");
        String xyz = console.nextLine();
        if (xyz.length() != 5){
            System.out.println("Вы ввели неверное количество символов. Должно быть 5");
            return;
        }
        String one = xyz.substring(0, 1);
        String three = xyz.substring(2, 3);
        String znak = xyz.substring(1, 2);
        String after = xyz.substring(xyz.lastIndexOf("=") + 1);
        String ravno = xyz.substring(3, 4);
        int xxx = xyz.length() - xyz.replace("=", "").length();
        int yyy = xyz.length() - xyz.replace("x", "").length();
        int zzz = xyz.length() - xyz.replace("+", "").length();
        int ccc = xyz.length() - xyz.replace("-", "").length();
        long count = xyz.codePoints().filter(Character::isDigit).count();
        if (ravno.equals("=") & xxx == 1 & yyy == 1 & zzz == 1 & znak.equals("+") & count == 2) {
            if (one.equals("x")) {
                int three1 = Integer.parseInt(three);
                int after1 = Integer.parseInt(after);
                System.out.println("Ответ: " + (after1 - three1));
                return;
            }
            if (three.equals("x")) {
                int one1 = Integer.parseInt(one);
                int after1 = Integer.parseInt(after);
                System.out.println("Ответ: " + (after1 - one1));
                return;
            }
            if (after.equals("x")) {
                int one1 = Integer.parseInt(one);
                int three1 = Integer.parseInt(three);
                System.out.println("Ответ: " + (one1 + three1));
                return;
            }
        }
        if (ravno.equals("=") & xxx == 1 & yyy == 1 & ccc == 1 & znak.equals("-") & count == 2) {
            if (after.equals("x")) {
                int one1 = Integer.parseInt(one);
                int three1 = Integer.parseInt(three);
                System.out.println("Ответ: " + (one1 - three1));
                return;
            }

            if (three.equals("x")) {
                int one1 = Integer.parseInt(one);
                int after1 = Integer.parseInt(after);
                System.out.println("Ответ: " + (one1 - after1));
                return;
            }
            if (one.equals("x")) {
                int three1 = Integer.parseInt(three);
                int after1 = Integer.parseInt(after);
                System.out.println("Ответ: " + (after1 + three1));
            }
            else System.out.println("Вы ввели некорректное уравнение");
        }
        else System.out.println("Вы ввели некорректное уравнение");
    }
}


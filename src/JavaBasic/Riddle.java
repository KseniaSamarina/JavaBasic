package JavaBasic;

import java.util.Objects;
import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        String answer;
        System.out.println("��������� �������:");
        System.out.println("����� ���, �� ��� ��� ����, ��� ��� ���������, ��� ����� ���������");
        Scanner inputAnswer = new Scanner(System.in);

        int attemptsCount = 3;
        boolean hintUsed = false;

        do {
            System.out.println("������� - " + attemptsCount);
            System.out.println("����� �����:");
            answer = inputAnswer.nextLine();
            switch (answer) {
                case ("���������������� �����") -> {
                    System.out.println("���������!");
                    attemptsCount = 0;
                }
                case ("���������") -> {
                    if (attemptsCount == 3 && !hintUsed) {
                        System.out.println("��� ����� �� ���! ������� ���");
                        attemptsCount = 1;
                    } else {
                        System.out.println("��������� ��� ����������");
                    }
                    hintUsed = true;
                }
                default -> {
                    if (attemptsCount > 1) {
                        System.out.println("������� ���");
                    }
                    attemptsCount--;
                }
            }
        }
        while (attemptsCount > 0);
        System.out.println("������, ������� � ������ ���");
    }
}
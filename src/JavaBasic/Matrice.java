package JavaBasic;

import java.util.Scanner;

public class Matrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] matrice;
        System.out.println("Пожалуйста, задайте размер квадратной матрицы");
        int matrixSize = console.nextInt();
        matrice = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.println("Введите число");
                int num = console.nextInt();
                matrice[i][j] = num;
            }
        }
        System.out.print("Ваша первая строка массива, умноженная на 3: ");
        for (int j = 0; j < matrixSize; j++) {
            System.out.print(matrice[0][j] * 3 + " ");
        }
        System.out.println("Ваша заполненная матрица");                         // Для удобства добавила вывод всей матрицы
        for (int k = 0; k<matrice.length; k++){
            for (int r = 0; r<matrice[k].length; r++) {
                System.out.print(matrice[k][r] + " ");
            }
            System.out.println();
        }
    }
}


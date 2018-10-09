package ClassTest01;

import java.util.Scanner;

public class ClassTestTask01 {
    public static void main(String[] args) {

        // ввод матрицы
        System.out.println("Введите число строк(столбцов), а затем элементы");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] secondaryDiagonal = getSideDiagonalAsVector(matrix);
        System.out.println("Элементы побочной диагонали:");
        for (int i = 0; i < secondaryDiagonal.length; i++) {
            System.out.print(secondaryDiagonal[i] + " ");

        }
        System.out.println();
        int[] vecResult = mult(matrix, secondaryDiagonal);
        System.out.println("Результат перемножения вектора и матрицы:");
        for (int i = 0; i < n; i++) {
            System.out.print(vecResult[i] + " ");
        }
        System.out.println();
        sortArr(vecResult);
        for (int i = 0; i < vecResult.length; i++) {
            System.out.print(vecResult[i] + " ");
        }
    }

    // элементы побочной диагонали
    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] secondaryDiagonal = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            secondaryDiagonal[i] = matrix[i][matrix.length - i - 1];
        }
        return secondaryDiagonal;
    }

    // перемножение матрицы и вектора
    static int[] mult(int[][] matrix, int[] vector) {
        int[] vecResult = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                vecResult[i] += matrix[i][j] * vector[i];
            }
        }
        return vecResult;
    }


    // сортировка массива в убывающем порядке

    static void sortArr(int[] sortArr) {
        for (int i = sortArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(sortArr[j]) < Math.abs(sortArr[j + 1])) {
                    int a = sortArr[j + 1];
                    sortArr[j + 1] = sortArr[j];
                    sortArr[j] = a;
                }
            }
        }
    }

}

/*
 00 01 02 03 04
 10 11 12 13 14
 20 21 22 23 24
 30 31 32 33 34
 40 41 42 43 44
 */
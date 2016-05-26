package com.epam.hometask;

import java.util.Scanner;

/**
 * @author Olga Lashkevich
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк первой матрицы: ");
        int rowA = scanner.nextInt();
        System.out.println("Введите количество столбцов первой матрицы: ");
        int colA = scanner.nextInt();
        System.out.println("Введите количество строк второй матрицы: ");
        int rowB = scanner.nextInt();
        System.out.println("Введите количество столбцов второй матрицы: ");
        int colB = scanner.nextInt();

        Matrix matrix = new Matrix(rowA, colA);
        matrix.print();
        Matrix matrix1 = new Matrix(rowB, colB);
        matrix1.print();

        matrix.multiply(matrix1).print();

    }
}

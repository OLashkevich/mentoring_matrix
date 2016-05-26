package com.epam.hometask;

/**
 * @author Olga Lashkevich
 */
public class Matrix {

    private int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public Matrix(int row, int col) {
        data = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    private void conditionTest(Matrix matrix) {
        int colCount_x = data[0].length;
        int rowCount_y = matrix.data.length;
        if (colCount_x != rowCount_y) {
            throw new RuntimeException("Матрицы умножить нельзя");
        }


    }

    public Matrix multiply(Matrix matrix) {
        conditionTest(matrix);
        int rowCount_x = data.length;
        int colCount_x = data[0].length;
        int colCount_y = matrix.data[0].length;
        int[][] matrix_result = new int[rowCount_x][colCount_y];
        for (int row = 0; row < rowCount_x; row++) {
            for (int col = 0; col < colCount_y; col++) {
                int result = 0;
                for (int k = 0; k < colCount_x; k++) {
                    result += data[row][k] * matrix.data[k][col];
                }
                matrix_result[row][col] = result;
            }

        }

        return new Matrix(matrix_result);

    }

    public void print() {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

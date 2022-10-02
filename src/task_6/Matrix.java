package task_6;

public class Matrix {
    public double[][] getMatrix(double[] array) {
        double[][] matrix = new double[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                matrix[i][j] = array[(j+i)%array.length];
            }
        }
        return matrix;
    }
    public void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.format("%7.3f", matrix[i][j]);
            }
        }
    }
}

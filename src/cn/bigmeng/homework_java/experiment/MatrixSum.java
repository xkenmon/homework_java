package cn.bigmeng.homework_java.experiment;

/**
 * MatrixSum
 */
public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int s1 = matrix[0][0]+matrix[2][2], s2 = matrix[0][2]+matrix[2][0];
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
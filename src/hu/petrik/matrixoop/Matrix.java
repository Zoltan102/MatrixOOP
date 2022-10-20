package hu.petrik.matrixoop;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int line;
    private int column;
    private int[][] m;
    private static final Random rnd = new Random();

    public Matrix(int line, int column) {
        this.line = line;
        this.column = column;
        this.m = new int[line][column];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rnd.nextInt(1000);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] line : m) {
            for (int e : line) {
                sb.append(String.format("%3d ", e));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}

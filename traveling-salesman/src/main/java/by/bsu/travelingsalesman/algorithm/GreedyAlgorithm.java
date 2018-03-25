package by.bsu.travelingsalesman.algorithm;

/**
 * Created by cplus on 25.03.2018.
 */
public class GreedyAlgorithm {
    private int[][] matrix;
    private int size;
    private int[] resultVertex;

    public GreedyAlgorithm() {
    }

    public GreedyAlgorithm(int[][] matrix) {
        this.matrix = matrix;
        size = matrix.length;
        resultVertex = new int[size];
    }

    public void doAlgorithm() {
        for (int i = 1; i < size; ++i) {

        }
    }

    private int getMinPosition(int[] array) {
        int pos = 0;
        int min = array[pos];
        int size = array.length;
        for (int i = 1; i < size; ++i) {
            if (array[i] < min) {
                min = array[i];
                pos = i;
            }
        }
        return pos;
    }
}

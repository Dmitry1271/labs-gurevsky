package by.bsu.travelingsalesman.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by cplus on 25.03.2018.
 */
public class Graph {
    private int[][] matrix;
    private List<Edge> edges = new ArrayList<>();

    public Graph() {
    }

    public Graph(int[][] matrix) {
        this.matrix = matrix;
        setEdges();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    private void setEdges() {
        int size = matrix.length;
        for (int j = 1; j < size; ++j) {
            for (int i = 0; i < j; ++i) {
                if (matrix[j][i] > 0) {
                    edges.add(new Edge(i + 1, j + 1, matrix[j][i]));
                }
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Graph graph = (Graph) o;

        if (!Arrays.deepEquals(matrix, graph.matrix)) return false;
        return edges != null ? edges.equals(graph.edges) : graph.edges == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + (edges != null ? edges.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "matrix=" + Arrays.toString(matrix) +
                '}';
    }
}


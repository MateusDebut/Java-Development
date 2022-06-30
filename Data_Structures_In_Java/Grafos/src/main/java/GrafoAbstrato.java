package main.java;

import java.util.List;

public abstract class GrafoAbstrato implements GraphInterface{
    int numeroDeVertices;
    List<Vertice> vertices;

    public GrafoAbstrato(List<Vertice> vertices) {
        this.numeroDeVertices = vertices.size();
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        return "GrafoAbstrato{" +
                "numeroDeVertices=" + numeroDeVertices +
                ", vertices=" + vertices +
                '}';
    }
}
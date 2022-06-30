package main.java;

import java.util.List;

public class GrafoMatriz extends DigrafoMatriz{
    public GrafoMatriz(List<Vertice> vertices) {
        super(vertices);
    }

    @Override
    public void adicionarAresta(int origem, int destino) {
        super.adicionarAresta(origem, destino);
        super.adicionarAresta(destino, origem);
    }

    @Override
    public void removerAresta(int origem, int destino) {
        super.removerAresta(origem, destino);
        super.removerAresta(destino, origem);
    }
}

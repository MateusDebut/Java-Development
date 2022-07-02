package main.grafo;

import java.util.List;

public class GrafoMatriz extends DigrafoMatriz{
    public GrafoMatriz(List<Vertice> vertices) {
        super(vertices);
    }

    @Override
    public void adicionarAresta(Vertice origem, Vertice destino) {
        super.adicionarAresta(origem, destino);
        super.adicionarAresta(destino, origem);
    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {
        super.removerAresta(origem, destino);
        super.removerAresta(destino, origem);
    }
}

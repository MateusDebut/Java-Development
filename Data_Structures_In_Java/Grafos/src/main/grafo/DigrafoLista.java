package main.grafo;

import java.util.List;

public class DigrafoLista extends GrafoAbstrato{
    public DigrafoLista(List<Vertice> vertices) {
        super(vertices);
    }

    @Override
    public void adicionarVertice(Vertice vertice) {

    }

    @Override
    public void removerVertice(Vertice vertice) {

    }

    @Override
    public void adicionarAresta(Vertice origem, Vertice destino) {

    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {

    }

    @Override
    public boolean arestaExiste(Vertice origem, Vertice destino) {
        return false;
    }

    @Override
    public boolean possuiAlgumaAresta(Vertice vertice) {
        return false;
    }

    @Override
    public int recuperaIndicePrimeiroVerticesConectados(Vertice vertice) {
        return 0;
    }

    @Override
    public int recuperaIndiceProximoVesticeConectado(Vertice vertice, Vertice arestaAtual) {
        return 0;
    }

    @Override
    public void printInGraphViz(String nomeArquivo) {

    }
}

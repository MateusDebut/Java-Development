package main.grafo;

import java.util.List;

public class GrafoLista extends DigrafoLista{

    public GrafoLista(List<Vertice> vertices) {
        super(vertices);
    }

    @Override
    public void adicionarAresta(Vertice origem, Vertice destino) {
        int indiceOrigem = vertices.indexOf(origem);
        int indiceDestino = vertices.indexOf(destino);
        listaDeAdjacencia.get(indiceOrigem).add(new Aresta(1, destino));
        listaDeAdjacencia.get(indiceDestino).add(new Aresta(1, origem));
    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {
        super.removerAresta(origem, destino);
        super.removerAresta(destino, origem);
    }

    @Override
    public boolean possuiAlgumaAresta(Vertice vertice) {
        int indiceVertice = vertices.indexOf(vertice);
        return !listaDeAdjacencia.get(indiceVertice).isEmpty();
    }


}

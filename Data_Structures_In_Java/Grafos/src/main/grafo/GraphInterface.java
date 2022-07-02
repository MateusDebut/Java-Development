package main.grafo;

public interface GraphInterface {
    void adicionarVertice(Vertice vertice);
    void removerVertice(Vertice vertice);
    void adicionarAresta(Vertice origem, Vertice destino);
    //TODO adicionar aresta generica
    //void adicionarAresta(Vertice origem, Vertice destino);
    void removerAresta(Vertice origem, Vertice destino);
    boolean arestaExiste(Vertice origem, Vertice destino);
    boolean possuiAlgumaAresta(Vertice vertice);
    int recuperaIndicePrimeiroVerticesConectados(Vertice vertice);
    int recuperaIndiceProximoVesticeConectado(Vertice vertice, int arestaAtual);
    String toString();
    void printInGraphViz(String nomeArquivo);
}

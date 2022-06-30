package main.java;

public interface GraphInterface {
    void adicionarVertice(Vertice vertice);
    void removerVertice(Vertice vertice);
    void adicionarAresta(int origem, int destino);
    //TODO adicionar aresta generica
    //void adicionarAresta(Vertice origem, Vertice destino);
    void removerAresta(int origem, int destino);
    boolean arestaExiste(int origem, int destino);
    boolean possuiAlgumaAresta(int vertice);
    int recuperaIndicePrimeiroVerticesConectados(int vertice);
    int recuperaIndiceProximoVesticeConectado(int vertice, int arestaAtual);
    String toString();
    void printInGraphViz(String nomeArquivo);
}

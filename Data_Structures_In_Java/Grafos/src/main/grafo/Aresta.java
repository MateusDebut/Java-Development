package main.grafo;

public class Aresta {
    int peso;
    Vertice destino;

    public Aresta(int peso) {
        this.peso = peso;
        this.destino = null;
    }

    public Aresta(int peso, Vertice destino) {
        this.peso = peso;
        this.destino = destino;
    }
}

package main.grafo;

public class Aresta {
    private int peso;
    private Vertice destino;

    public Aresta(int peso) {
        this.peso = peso;
        this.destino = null;
    }

    public Aresta(int peso, Vertice destino) {
        this.peso = peso;
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }
}

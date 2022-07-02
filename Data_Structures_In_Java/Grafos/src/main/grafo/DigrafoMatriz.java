package main.grafo;

import java.util.List;

public class DigrafoMatriz extends GrafoAbstrato {

    Aresta[][] matrizDeAdjacencia;

    public DigrafoMatriz(List<Vertice> vertices) {
        super(vertices);
        inicializaMatrizDeAdjacencia();
    }

    private void inicializaMatrizDeAdjacencia() {
        matrizDeAdjacencia = new Aresta[numeroDeVertices][numeroDeVertices];
        for (int i = 0; i < numeroDeVertices; i++) {
            for (int j = 0; j < numeroDeVertices; j++) {
                matrizDeAdjacencia[i][j] = null;
            }
        }
    }


    @Override
    public void adicionarVertice(Vertice vertice) {

    }

    @Override
    public void removerVertice(Vertice vertice) {

    }

    @Override
    public void adicionarAresta(Vertice origem, Vertice destino) {
        if(!arestaExiste(origem, destino)){
            matrizDeAdjacencia[vertices.indexOf(origem)][vertices.indexOf(destino)] = new Aresta(1);
        }
    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {
        if(arestaExiste(origem, destino)){
            matrizDeAdjacencia[vertices.indexOf(origem)][vertices.indexOf(destino)] = null;
        }
    }

    @Override
    public boolean arestaExiste(Vertice origem, Vertice destino) {
        return matrizDeAdjacencia[vertices.indexOf(origem)][vertices.indexOf(destino)] != null;
    }

    @Override
    public boolean possuiAlgumaAresta(Vertice vertice) {
        for (int i = 0; i < numeroDeVertices; i++) {
            if (matrizDeAdjacencia[vertices.indexOf(vertice)][i] != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public int recuperaIndicePrimeiroVerticesConectados(Vertice vertice) {
        return recuperaIndiceProximoVesticeConectado(vertice, 0);
    }

    @Override
    public int recuperaIndiceProximoVesticeConectado(Vertice vertice, int arestaAtual) {
        for (int i = vertices.indexOf(arestaAtual); i < numeroDeVertices; i++) {
            if(arestaExiste(vertice, vertices.get(i))){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numeroDeVertices; i++) {
            stringBuilder.append(i).append(": ");
            for (int j = 0; j < numeroDeVertices; j++) {
                if(arestaExiste(vertices.get(i),vertices.get(j))){
                    stringBuilder.append(matrizDeAdjacencia[i][j].getPeso()).append(" ");
                }else{
                    stringBuilder.append(0 + " ");
                }
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void printInGraphViz(String nomeArquivo) {

    }

    @Override
    public float recuperaDistancia(Vertice origem, Vertice destino) {
        return matrizDeAdjacencia[vertices.indexOf(origem)][vertices.indexOf(destino)].getPeso();
    }
}

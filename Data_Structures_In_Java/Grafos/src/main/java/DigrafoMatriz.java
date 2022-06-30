package main.java;

import java.util.List;

public class DigrafoMatriz extends GrafoAbstrato{

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
    public void adicionarAresta(int origem, int destino) {
        if(!arestaExiste(origem, destino)){
            matrizDeAdjacencia[origem][destino] = new Aresta(1);
        }
    }

    @Override
    public void removerAresta(int origem, int destino) {
        if(arestaExiste(origem, destino)){
            matrizDeAdjacencia[origem][destino] = null;
        }
    }

    @Override
    public boolean arestaExiste(int origem, int destino) {
        return matrizDeAdjacencia[origem][destino] != null;
    }

    @Override
    public boolean possuiAlgumaAresta(int vertice) {
        for (int i = 0; i < numeroDeVertices; i++) {
            if (matrizDeAdjacencia[vertice][i] != null){
                return true;
            }
        }
        return false;
    }

    @Override
    public int recuperaIndicePrimeiroVerticesConectados(int vertice) {
        return recuperaIndiceProximoVesticeConectado(vertice, 0);
    }

    @Override
    public int recuperaIndiceProximoVesticeConectado(int vertice, int arestaAtual) {
        for (int i = arestaAtual; i < numeroDeVertices; i++) {
            if(arestaExiste(vertice, i)){
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
                if(arestaExiste(i,j)){
                    stringBuilder.append(matrizDeAdjacencia[i][j].valor).append(" ");
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
}

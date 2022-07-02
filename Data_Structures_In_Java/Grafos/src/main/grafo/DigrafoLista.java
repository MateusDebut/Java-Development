package main.grafo;

import java.util.ArrayList;
import java.util.List;

public class DigrafoLista extends GrafoAbstrato{
    List<List<Aresta>> listaDeAdjacencia;
    public DigrafoLista(List<Vertice> vertices) {
        super(vertices);
        inicializaListaDeAdjacencia();
    }

    private void inicializaListaDeAdjacencia() {
        listaDeAdjacencia = new ArrayList<>();
        for (int i = 0; i < numeroDeVertices; i++) {
            listaDeAdjacencia.add(new ArrayList<>());
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
        int indiceOrigem = vertices.indexOf(origem);
        listaDeAdjacencia.get(indiceOrigem).add(new Aresta(1, destino));
    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {
        int indiceOrigem = vertices.indexOf(origem);
        List<Aresta> arestasOrigem = listaDeAdjacencia.get(indiceOrigem);
        for (int i = arestasOrigem.size()-1; i >= 0; i--) {
            if(arestasOrigem.get(i).destino == destino){
                arestasOrigem.remove(i);
            }
        }
    }

    @Override
    public boolean arestaExiste(Vertice origem, Vertice destino) {
        int indiceOrigem = vertices.indexOf(origem);
        List<Aresta> arestasOrigem = listaDeAdjacencia.get(indiceOrigem);
        for (int i = 0; i < arestasOrigem.size(); i++) {
            if(arestasOrigem.get(i).destino == destino){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean possuiAlgumaAresta(Vertice vertice) {
        int indiceVertice = vertices.indexOf(vertice);
        if(!listaDeAdjacencia.get(indiceVertice).isEmpty()){
            return true;
        }

        for (int i = 0; i < numeroDeVertices; i++) {
            for (int j = 0; j < listaDeAdjacencia.get(i).size(); j++) {
                if(listaDeAdjacencia.get(i).get(j).destino == vertice){
                    return true;
                }
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
        int indiceVertice = vertices.indexOf(vertice);
        if(arestaAtual >= listaDeAdjacencia.get(indiceVertice).size()){
            return -1;
        }else{
            return ++arestaAtual;
        }
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numeroDeVertices; i++) {
            stringBuilder.append(i).append(": ");
            for (int j = 0; j < listaDeAdjacencia.get(i).size(); j++) {
                stringBuilder.append(listaDeAdjacencia.get(i).get(j).peso).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void printInGraphViz(String nomeArquivo) {

    }
}

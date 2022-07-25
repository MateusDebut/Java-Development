package main.grafo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DigrafoMap extends GrafoAbstrato{

    private Map<Vertice, List<Aresta>> mapaDeAdjacencia;

    public DigrafoMap(List<Vertice> vertices) {
        super(vertices);
        inicializaMapaDeAdjacencia();
    }

    private void inicializaMapaDeAdjacencia() {
        mapaDeAdjacencia = new HashMap<>();
    }

    public Map<Vertice, List<Aresta>> getMapaDeAdjacencia() {
        return mapaDeAdjacencia;
    }

    public void setMapaDeAdjacencia(Map<Vertice, List<Aresta>> mapaDeAdjacencia) {
        this.mapaDeAdjacencia = mapaDeAdjacencia;
    }

    @Override
    public void adicionarVertice(Vertice vertice) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removerVertice(Vertice vertice) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void adicionarAresta(Vertice origem, Vertice destino) {
        if (!arestaExiste(origem, destino)){
            if(!mapaDeAdjacencia.containsKey(origem)){
                mapaDeAdjacencia.put(origem, new ArrayList<>());
            }
            List<Aresta> arestaList = mapaDeAdjacencia.get(origem);
            arestaList.add(new Aresta(1, destino));
        }
    }

    @Override
    public void removerAresta(Vertice origem, Vertice destino) {
        List<Aresta> arestasOrigem = mapaDeAdjacencia.get(origem);
        for(int i = arestasOrigem.size() - 1; i >= 0; i--){
            if(arestasOrigem.get(i).getDestino() == destino){
                arestasOrigem.remove(i);
            }
        }
    }

    @Override
    public boolean arestaExiste(Vertice origem, Vertice destino) {
        if(mapaDeAdjacencia.containsKey(origem)){
            List<Aresta> arestasOrigem = mapaDeAdjacencia.get(origem);
            for(Aresta aresta : arestasOrigem){
                if(aresta.getDestino() == destino){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean possuiAlgumaAresta(Vertice vertice) {
        if (mapaDeAdjacencia.containsKey(vertice)){
            return true;
        }

        for (int i = 0; i < numeroDeVertices; i++) {
            for (int j = 0; j < mapaDeAdjacencia.get(vertices.get(i)).size(); j++) {
                if(mapaDeAdjacencia.get(vertices.get(i)).get(j).getDestino() == vertice){
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public int recuperaIndicePrimeiroVerticesConectados(Vertice vertice) {
        if(!mapaDeAdjacencia.containsKey(vertice)){
            return -1;
        }
        return vertices.indexOf(mapaDeAdjacencia.get(vertice).get(0).getDestino());
    }

    @Override
    public int recuperaIndiceProximoVesticeConectado(Vertice vertice, int arestaAtual) {
        var indiceAtualVerticeAdjacente = 0;
        while(mapaDeAdjacencia.get(vertice).get(indiceAtualVerticeAdjacente).getDestino() !=
                vertices.get(arestaAtual)){
            indiceAtualVerticeAdjacente++;
        }
        if(mapaDeAdjacencia.get(vertice).size() > indiceAtualVerticeAdjacente){
            return vertices.indexOf(mapaDeAdjacencia.get(vertice)
                    .get(indiceAtualVerticeAdjacente).getDestino());
        }
        return -1;
    }

    @Override
    public void printInGraphViz(String nomeArquivo) {

    }

    @Override
    public float recuperaDistancia(Vertice origem, Vertice destino) {
        for (int i = 0; i < mapaDeAdjacencia.get(origem).size(); i++) {
            if(mapaDeAdjacencia.get(origem).get(i).getDestino() == destino){
                return mapaDeAdjacencia.get(origem).get(i).getPeso();
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        var string = new StringBuilder();
        for (Map.Entry<Vertice, List<Aresta>> par : mapaDeAdjacencia.entrySet()){
            string.append(vertices.indexOf(par.getKey())).append(": ");
            for (int i = 0; i < par.getValue().size(); i++) {
                string.append(par.getValue().get(i).getPeso()).append(" ");
            }
            string.append("\n");
        }
        return string.toString();
    }
}

package main.grafo;

import java.util.LinkedList;
import java.util.Queue;

public final class TravessiaEmLargura implements TravessiaStrategy{

    @Override
    public String travessiaEmGrafo(GrafoAbstrato grafo, Vertice origem) {
        var visitados = new boolean[grafo.numeroDeVertices];
        visitados[grafo.vertices.indexOf(origem)] = true;

        Queue<Vertice> verticesParaVisitar = new LinkedList<>();
        verticesParaVisitar.add(origem);

        var caminhoVisitado = new StringBuilder();

        Vertice verticeVisitadoAtual;
        while (!verticesParaVisitar.isEmpty()){
            verticeVisitadoAtual = verticesParaVisitar.poll();
            if(verticeVisitadoAtual != null){
                caminhoVisitado.append(verticeVisitadoAtual).append(' ');

                int indiceVerticeAdjacente = grafo
                        .recuperaIndicePrimeiroVerticesConectados(verticeVisitadoAtual);

                //Se for diferente de -1, possui visinho
                while (indiceVerticeAdjacente != -1){
                    if(!visitados[indiceVerticeAdjacente]){
                        visitados[indiceVerticeAdjacente] = true;
                        verticesParaVisitar.add(grafo.vertices.get(indiceVerticeAdjacente));
                    }
                    indiceVerticeAdjacente = grafo.
                            recuperaIndiceProximoVesticeConectado(verticeVisitadoAtual, indiceVerticeAdjacente);

                }
            }
        }
        return caminhoVisitado.toString();
    }
}

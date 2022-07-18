package main.grafo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TravessiaEmProfundidade implements TravessiaStrategy{


    @Override
    public String travessiaEmGrafo(GrafoAbstrato grafo, Vertice origem) {
        var visitados = new float[grafo.numeroDeVertices];
        Arrays.fill(visitados, -1);
        visitados[grafo.vertices.indexOf(origem)] = 0;

        Queue<Vertice> verticesParaVisitar = new LinkedList<>();
        verticesParaVisitar.add(origem);





        return caminhoVisitado.toString();
    }

    private String travessia(GrafoAbstrato grafo, Vertice origem,
                             float[] visitados, Queue<Vertice> verticesParaVisitar){
        if(grafo.recuperaIndicePrimeiroVerticesConectados(origem) != -1){
            return travessia()
        }
        var caminhoVisitado = new StringBuilder();
        Vertice verticeVisitadoAtual;

        while (!verticesParaVisitar.isEmpty()){
            verticeVisitadoAtual = verticesParaVisitar.poll();
            if(verticeVisitadoAtual != null){
                caminhoVisitado.append(verticeVisitadoAtual).append(' ')
                        .append("Distancia: ").append(visitados[grafo.vertices.indexOf(verticeVisitadoAtual)])
                        .append(' ');

                int indiceVerticeAdjacente = grafo
                        .recuperaIndicePrimeiroVerticesConectados(verticeVisitadoAtual);

                //Se for diferente de -1, possui visinho
                if (indiceVerticeAdjacente != -1){
                    travessiaEmGrafo(grafo, grafo.vertices.get(indiceVerticeAdjacente));
                    if(visitados[indiceVerticeAdjacente] < 0){
                        float distanciaAtual = visitados[grafo.vertices.indexOf(verticeVisitadoAtual)];
                        visitados[indiceVerticeAdjacente] =
                                distanciaAtual +
                                        grafo.recuperaDistancia(verticeVisitadoAtual,
                                                grafo.vertices.get(indiceVerticeAdjacente));
                        verticesParaVisitar.add(grafo.vertices.get(indiceVerticeAdjacente));
                    }
                    indiceVerticeAdjacente = grafo.
                            recuperaIndiceProximoVesticeConectado(verticeVisitadoAtual, indiceVerticeAdjacente);

                }
            }
        }
    }

}

package main;

import main.grafo.GrafoAbstrato;
import main.grafo.GrafoLista;
import main.grafo.GrafoMatriz;
import main.grafo.Vertice;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GrafoAbstrato grafo = new GrafoLista(new ArrayList<>(){{
            add(new Vertice("João"));
            add(new Vertice("Maria"));
            add(new Vertice("José"));
            add(new Vertice("Clarice"));
            add(new Vertice("Pedro"));
        }});

        grafo.adicionarAresta(grafo.vertices.get(0),grafo.vertices.get(1));
        grafo.adicionarAresta(grafo.vertices.get(0),grafo.vertices.get(2));
        grafo.adicionarAresta(grafo.vertices.get(1),grafo.vertices.get(2));
        grafo.adicionarAresta(grafo.vertices.get(2),grafo.vertices.get(0));
        grafo.adicionarAresta(grafo.vertices.get(2),grafo.vertices.get(3));

        System.out.println(grafo);

    }
}

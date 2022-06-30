package main.java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GrafoAbstrato grafo = new GrafoMatriz(new ArrayList<>(){{
            add(new Vertice("João"));
            add(new Vertice("Maria"));
            add(new Vertice("José"));
            add(new Vertice("Clarice"));
            add(new Vertice("Pedro"));
        }});

        grafo.adicionarAresta(0,1);
        grafo.adicionarAresta(0,2);
        grafo.adicionarAresta(1,2);
        grafo.adicionarAresta(2,0);
        grafo.adicionarAresta(2,3);

        System.out.println(grafo);

    }
}

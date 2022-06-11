package main;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(new Elemento("123"));
        pilha.push(new Elemento("456"));
        pilha.push(new Elemento("789"));
        pilha.printPilha();
        pilha.pop();
        pilha.printPilha();
    }
}

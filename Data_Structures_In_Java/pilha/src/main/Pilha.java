package main;

public class Pilha {
    private Elemento topo;

    public Pilha() {}

    public Pilha(Elemento topo) {
        this.topo = topo;
        topo.setElementoAbaixo(null);
        topo.setId(1);
    }

    public Elemento getTopo() {
        return topo;
    }

    public void push(Elemento topo) {
        if(this.topo == null){
            this.topo = topo;
            this.topo.setElementoAbaixo(null);
            topo.setId(1);
            return;
        }
        topo.setElementoAbaixo(this.topo);
        this.topo = topo;
        this.topo.setId(this.topo.getElementoAbaixo().getId() + 1);
    }

    public void printPilha(){
        Elemento elementoAuxiliar = this.topo;
        while(elementoAuxiliar != null){
            elementoAuxiliar.printElemento();
            elementoAuxiliar = elementoAuxiliar.getElementoAbaixo();
        }
    }

    public Elemento pop(){
        Elemento elementoTemporario = this.topo;
        this.topo = this.topo.getElementoAbaixo();
        return elementoTemporario;
    }
}

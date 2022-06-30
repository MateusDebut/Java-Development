import java.util.LinkedList;

public class ListaLigada <T>{
    private int numeroDeElementos;
    private Nodo<T> primeiro;
    private Nodo<T> ultimo;

    public ListaLigada() {
        this.numeroDeElementos = 0;
    }

    public boolean estaVazia(){
        return this.primeiro == null ? true : false;
    }

    public int tamanho(){
        return this.numeroDeElementos;
    }

    public void adicionar(T elemento){
        if(this.primeiro == null){
            Nodo<T> nodo = new Nodo<>(elemento);
            this.primeiro = nodo;
            this.numeroDeElementos++;
        }else{
            Nodo<T> temp = this.primeiro;
            while(temp != this.ultimo){
                temp = temp.getProximo();
            }
            temp.setProximo(new Nodo<>(elemento));
            this.numeroDeElementos++;
        }
    }

    public void remover(int indice){
        int contador = 0;
        Nodo<T> aux = this.primeiro;
        while (contador < indice && aux != this.ultimo){
            if(contador == indice && aux != null){
                aux.getAnterior().setProximo(aux.getProximo());
                aux.getProximo().setAnterior(aux.getAnterior());
                this.numeroDeElementos--;
                return;
            }
            contador++;
            aux = aux.getProximo();
        }
    }
}

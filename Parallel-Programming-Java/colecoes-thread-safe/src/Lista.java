public class Lista {
    private String[] elementos = new String[1000];
    private int indice = 0;

    public synchronized void adicionarElemento(String elemento){
        this.elementos[indice] = elemento;
        this.indice++;
    }

    public int getTamanho(){
        return this.elementos.length;
    }

    public String pegaElemento(int posicao){
        return this.elementos[posicao];
    }
}

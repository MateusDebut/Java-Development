public class TarefaFazNumero1 implements Runnable {
    private Banheiro banheiro;
    public TarefaFazNumero1(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.fazerNumero1();
    }
}

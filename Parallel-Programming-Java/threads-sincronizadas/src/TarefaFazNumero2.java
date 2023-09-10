public class TarefaFazNumero2 implements Runnable {
    private Banheiro banheiro;
    public TarefaFazNumero2(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.fazerNumero2();
    }
}

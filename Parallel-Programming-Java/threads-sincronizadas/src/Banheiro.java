public class Banheiro {

    public void fazerNumero1() {
        System.out.println(Thread.currentThread().getName() + " batendo na porta");
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " entrando no banheiro");
            System.out.println(Thread.currentThread().getName() + " Fazendo coisa rápida");
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " dando descarga");
            System.out.println(Thread.currentThread().getName() + " lavando as mãos");
            System.out.println(Thread.currentThread().getName() + " saindo do banheiro");
        }
    }

    public void fazerNumero2() {
        System.out.println(Thread.currentThread().getName() + " batendo na porta");
        synchronized (this){
            System.out.println(Thread.currentThread().getName() + " entrando no banheiro");
            System.out.println(Thread.currentThread().getName() + " Fazendo coisa demorada");
            try{
                Thread.sleep(6000);
            }catch (Exception e){
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " dando descarga");
            System.out.println(Thread.currentThread().getName() + " lavando as mãos");
            System.out.println(Thread.currentThread().getName() + " saindo do banheiro");
        }
    }
}

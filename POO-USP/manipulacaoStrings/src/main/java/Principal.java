public class Principal {
    public static void main(String[] args) {
        String nome = "Matseusss";
        String sobrenome = new String("Santos"); //Cria um objeto na heap e uma string no pool de strings
        System.out.println(nome + " " + sobrenome);

        System.out.println(nome.substring(0,3));
        System.out.println(nome.replace("s", ""));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.isBlank());
        System.out.println(nome.contains("at"));


    }
}

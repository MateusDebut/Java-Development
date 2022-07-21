public class AlunoReflection {
    private int id;
    private String nome;
    private String codigoMatricula;

    public AlunoReflection() {
    }

    public AlunoReflection(int id, String nome, String codigoMatricula) {
        this.id = id;
        this.nome = nome;
        this.codigoMatricula = codigoMatricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }
}

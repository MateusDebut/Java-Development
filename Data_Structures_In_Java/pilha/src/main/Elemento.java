package main;

public class Elemento {
    private int id;
    private String documento;
    private Elemento elementoAbaixo;

    public Elemento( String documento) {
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Elemento getElementoAbaixo() {
        return elementoAbaixo;
    }

    protected void setElementoAbaixo(Elemento elementoAbaixo) {
        this.elementoAbaixo = elementoAbaixo;
    }

    public void printElemento(){
        System.out.println("id do elemento: " + this.getId());
        System.out.println("numero do documento: " + this.getDocumento());
        System.out.println();
    }
}

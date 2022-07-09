public enum Status {

    ATIVO("AUTHORIZED"),
    EXPIRADO("REJECTED"),
    PENDENTE("AWATING_AUTHORIZATION");

    private String text;

    Status(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public static String getText(String texto) {
        Status[] valores = Status.values();

        for (Status status: valores) {
            if (status.text.equals(texto)){
                return status.toString();
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Consent consent = new Consent();
        consent.status = "AUTHORIZED";
        consent.formatted_status = Status.getText(consent.status).toLowerCase();
    }
}

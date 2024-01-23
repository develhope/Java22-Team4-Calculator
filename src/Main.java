public class Main {

    public static void main(String[] args) {
        String operazione = "1:2=";
        String tipo = determinaTipoOperazione(operazione);
        System.out.println("Tipo di operazione: " + tipo);
    }

    public static String determinaTipoOperazione(String operazione) {
        if (operazione.contains("+")) {
            return "SOMMA";
        } else if (operazione.contains("-")) {
            return "DIFFERENZA";
        } else if (operazione.contains("*")) {
            return "MOLTIPLICAZIONE";
        } else if (operazione.contains("/")) {
            return "DIVISIONE";
        } else if (operazione.contains("^")) {
            return "POTENZA";
        } else {
            // Tipo di operazione non riconosciuto
            return "OPERAZIONE NON SUPPORTATA";
        }
    }
}
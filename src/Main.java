public class Main {

    public static void main(String[] args) {
 addition
        int risultatoSomma = somma(6, 3);
        System.out.println("Somma: " + risultatoSomma);
    }
    
    public static int somma(int valore1, int valore2) {
    int risultato = valore1 + valore2;
    return risultato;
    }
} 

 sub2
        int risultatoSottrazione = sottrazione(6, 3);
        System.out.println("Sottrazione: " + risultatoSottrazione);
    }

    public static int sottrazione(int valore1, int valore2) {
        int risultato = valore1 - valore2;
        return risultato;
    }
}



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


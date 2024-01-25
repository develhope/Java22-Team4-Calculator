public class Main {
public static void main (String[] args){

        System.out.println(divisionMethod(12,66));
        System.out.println(moltiplicationMethod(13,6));
        System.out.println(additionMethod(2,9));
        System.out.println(subtrationMethod(34,8));
    addition
    int risultatoSomma = somma(6, 3);
    System.out.println("Somma: " + risultatoSomma);
}

    public static int somma(int valore1, int valore2) {
        return valore1 + valore2;
    }
    }

    //metodo che definisce la divisione:
    public static float divisionMethod(float firstValue, float secondValue){

        return firstValue / secondValue;

    }
    //metodo che definisce la moltiplicazione:
    public static float moltiplicationMethod(float firstValue, float secondValue){

        return firstValue * secondValue;

    }
    //metodo che definisce l'addizione:
    public static float additionMethod(float firstValue, float secondValue){

        return firstValue + secondValue;

    }
}

 sub2
        int risultatoSottrazione = sottrazione(6, 3);
        System.out.println("Sottrazione: " + risultatoSottrazione);
    }

    public static int sottrazione(int valore1, int valore2) {

          return valore1 - valore2;




    //metodo che definisce la sottrazione:
    public static float subtrationMethod(float firstValue, float secondValue){

        return firstValue - secondValue;

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


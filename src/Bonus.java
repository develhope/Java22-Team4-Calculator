public class Bonus { public static void main(String[] args) {
    double[] numeri = {10.5, 5.2, 3.0, 2.0};

    double risultatoSomma = somma(numeri);
    System.out.println("Il risultato della somma è: " + risultatoSomma);

    double risultatoMoltiplicazione = moltiplica(numeri);
    System.out.println("Il risultato della moltiplicazione è: " + risultatoMoltiplicazione);

    RisultatoDivisione risultatoDivisione = divide(numeri);
    System.out.println("Il quoziente della divisione è: " + risultatoDivisione.quoziente);
    System.out.println("Il resto della divisione è: " + risultatoDivisione.resto);
}

    public static double somma(double[] numeri) {
        double risultato = 0.0;
        for (double numero : numeri) {
            risultato += numero;
        }
        return risultato;
    }

    public static double moltiplica(double[] numeri) {
        double risultato = 1.0;
        for (double numero : numeri) {
            risultato *= numero;
        }
        return risultato;
    }

    public static RisultatoDivisione divide(double[] numeri) {
        if (numeri.length == 0) {
            throw new IllegalArgumentException("L'array dei numeri non può essere vuoto.");
        }

        double dividendo = numeri[0];
        for (int i = 1; i < numeri.length; i++) {
            double divisore = numeri[i];
            if (divisore == 0.0) {
                throw new ArithmeticException("Impossibile dividere per zero.");
            }

            dividendo /= divisore;
        }

        double quoziente = (int) dividendo; // Parte intera della divisione
        double resto = dividendo % 1; // Resto della divisione

        return new RisultatoDivisione(quoziente, resto);
    }
}

class RisultatoDivisione {
    double quoziente;
    double resto;

    public RisultatoDivisione(double quoziente, double resto) {
        this.quoziente = quoziente;
        this.resto = resto;
    }
}


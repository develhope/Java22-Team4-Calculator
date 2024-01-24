public class Potenza {
    public static void main(String[] args) {
        double base = 2;
        int esponente = 3;

        double risultato = calcolaPotenza(base, esponente);

        System.out.println(base + " elevato a " + esponente + " è uguale a " + risultato);
    }

    static double calcolaPotenza(double base, int esponente) {
        if (esponente == 0) {
            return 1;
        }

        double risultato = 1;

        for (int i = 0; i < Math.abs(esponente); i++) {
            risultato *= base;
        }

        if (esponente < 0) {
            risultato = 1 / risultato;
        }

        return risultato;
    }
}

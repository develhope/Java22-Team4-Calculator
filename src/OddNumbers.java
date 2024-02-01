public class OddNumbers {
    //Un metodo che preveda un valore in ingresso e
    // determini se quel valore è pari o dispari
    // e restituendo il tipo.
    static void checkEven(int x) {
        if(x%2 == 0) {
            System.out.println(x + " e' pari.");
            System.out.println(x + " e' pari, ma è un brutto numero.");
            System.out.println(x + " e' pari, ma è forse è anche bello.");
        }
        else {
            System.out.println(x + " e' dispari.");
        }
    }
}

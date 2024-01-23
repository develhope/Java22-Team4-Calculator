public class Main {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("il numero è " +x);
        System.out.println("il numero è pari?");
        checkEven(x);
    }
//Un metodo che preveda un valore in ingresso e
// determini se quel valore è pari o dispari
// e restituendo il tipo.

    static void checkEven(int x) {
        if(x%2 == 0) {
            System.out.println(x + " e' pari.");
        }
        else {
            System.out.println(x + " e' dispari.");
        }
    }
}

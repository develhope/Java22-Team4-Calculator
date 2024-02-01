public class Main {
        public static void main(String[] args) {
            int x = 6;
            int y = 11;
            System.out.println("il numero è " +x);
            System.out.println("il numero è pari?");
            checkEven(x);
            System.out.println("i numeri moltiplicati sono pari a " +multipNumbers(x, y));
        }

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

        //il metodo seguente restituisce il valore della moltiplicazione di due numeri
        static int multipNumbers(int x, int y) {
            return (x * y);
        }
    }

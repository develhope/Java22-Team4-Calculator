import java.util.Objects;
import java.util.Scanner;
public class UtenteInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire primo numero");
        double x = scanner.nextInt();
        System.out.println("Inserire tipo di operatore");
        String operatore = scanner.next();
        System.out.println("Inserire secondo numero");
        double y = scanner.nextInt();


        if (Objects.equals(operatore, "/")){
            try {
                double division = x / y;
                System.out.println("risultato della divisione= " + division);
            }catch(ArithmeticException e){
                System.out.println("non è possibile dividere per 0");
            }
        } else if (Objects.equals(operatore, "*")) {
            double moltiplication = x * y;
            System.out.println("risultato della moltiplicazione= " + moltiplication);
        } else if (Objects.equals(operatore, "+")) {
            double add = x + y;
            System.out.println("risultato della addizione= " + add);
        } else if (Objects.equals(operatore, "-")) {
            double sub = x - y;
            System.out.println("risultato della sottrazione= " + sub);
        }
        scanner.close();
        System.out.println("\nCiao <3");
    }
}
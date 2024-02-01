import java.util.Objects;
import java.util.Scanner;
public class UtenteInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire primo numero");
        int x = scanner.nextInt();
        System.out.println("Inserire secondo numero");
        int y = scanner.nextInt();
        System.out.println("Inserire tipo di operatore");
        String operatore = scanner.next();

        if (Objects.equals(operatore, "/")) {
            int division = x / y;
            System.out.println("risultato della divisione= " + division);

        } else if (Objects.equals(operatore, "*")) {
            int moltiplication = x * y;
            System.out.println("risultato della moltiplicazione= " + moltiplication);
        } else if (Objects.equals(operatore, "+")) {
            int add = x + y;
            System.out.println("risultato della addizione= " + add);
        } else if (Objects.equals(operatore, "-")) {
            int sub = x - y;
            System.out.println("risultato della sottrazione= " + sub);
        }
        scanner.close();
    }
}

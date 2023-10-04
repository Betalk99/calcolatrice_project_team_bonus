import java.util.Scanner;

import static java.lang.System.in;

public class EvenOdd {
    public static void evenOdd(double a, double b, Scanner in) {


        boolean stay = false;
        while (!stay) {

            System.out.println("Di quale dei due valori vuoi verificare il tipo? (1) o (2)");
            char risposta = in.next().charAt(0);

            if (risposta == '1') {
                if ((a % 2) == 0) {
                    System.out.println("Il numero è pari.");
                } else {
                    System.out.println("Il numero è dispari.");
                }
                stay = true;
            } else if (risposta == '2') {
                if ((b % 2) == 0) {
                    System.out.println("Il numero è pari.");
                } else {
                    System.out.println("Il numero è dispari.");
                }
                stay = true;
            } else {
                System.out.println("Input non valido.");
                stay = false;
            }
        }
    }
}

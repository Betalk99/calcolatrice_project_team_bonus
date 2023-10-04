import java.util.Scanner;

public class MatrixValuesChooser {
    public static void array(Scanner in) {
        int dimension = getArrayLength(in);
        double[] arraySec = new double[dimension];
        System.out.println("Digita i singoli numeri premendo invio dopo ognuno di essi: (es. 1 -> 2 -> etc...)");
        Main.arrayFiller(dimension, arraySec, in);
    }

    public static int getArrayLength(Scanner in) {

        System.out.println("Digita la quantità di numeri da gestire: (es. 5) ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }

    public static double firstValue(double[] arraySec, Scanner in) {
        double valUno;
        System.out.println("Indica la posizione corrispettiva al primo valore che vuoi utilizzare, dopodiché premi invio:");
        int x = in.nextInt();
        valUno = arraySec[x];
        System.out.println("Il primo valore selezionato è:  " + valUno);
        return valUno;
    }

    public static double secondValue(double[] arraySec, Scanner in) {
        double valDue;
        System.out.println("Indica la posizione corrispettiva al secondo valore che vuoi utilizzare, dopodiché premi invio:");
        int y = in.nextInt();
        valDue = arraySec[y];
        System.out.println("Il secondo valore selezionato è:" + valDue);
        return valDue;
    }

    public static char whatOper(Scanner in) {
        boolean stay = false;
        char oper = 0;
        while (!stay) {
            System.out.println("Scrivere il simbolo dell'operazione da eseguire: ");
            oper = in.next().charAt(0);
            if (oper != '+' && oper != '-' && oper != '*' && oper != '/' && oper != '^') {
                System.out.println("Il carattere selezionato è errato. Scegliere uno tra i seguenti caratteri: +, -, *, /, ^");
            } else
                stay = true;
        }
        return oper;
    }

    public static void outputMatrice(double[] arraySec, int dimension) {
        System.out.println("Posizione: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(i);
            System.out.print("   ");
        }
        System.out.println("  ");
        System.out.println("Valore: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(arraySec[i]);
            System.out.print(" ");
        }
        System.out.println("   ");
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = Input.input();
        array(in);
    }
    /* Funzione che prende un input */
    public static void array(Scanner in){
        int dimension = getArrayLength(in);
        double[] arraySec = new double[dimension];

        System.out.println("Inserisci gli elementi che compongono l'array :");
        riempiArray(dimension, arraySec, in);
    }
    public static int getArrayLength(Scanner in) {
        System.out.println("Inserisci la dimensioni dell'array: ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }
    public static void riempiArray(int dimension,double[] arraySec, Scanner in){
        for (int i = 0; i < dimension; i++) {
            arraySec[i] = in.nextDouble();
        }

        outputMatrice(arraySec, dimension);

        double valUno = valoreUno(arraySec, in);
        double valDue = valoreDue(arraySec, in);
        char oper = whtOper(in);

        Operazione.whatOper(valUno,valDue, oper);  //richiamo del metodo per capire tipo di operazione

        EvenOdd.evenOdd(valUno, valDue, in);

    }
    public static double valoreUno(double[] arraySec, Scanner in){
        double valUno;
        System.out.println("Quali valori vuoi utilizzare: (max 2)");
        System.out.println("Indicare la posizione ");
        int x = in.nextInt();
        valUno = arraySec[x];
        System.out.println("Valore che hai scelto è:  " + valUno);
        return valUno;
    }
    public static double valoreDue(double[] arraySec, Scanner in){
        double valDue;
        System.out.println("Quali valori vuoi utilizzare: (max 2)");
        System.out.println("Indicare la posizione ");
        int y = in.nextInt();
        valDue = arraySec[y];
        System.out.println("Valore che hai scelto è:  " + valDue);
        return valDue;
    }
    public static char whtOper(Scanner in){
        System.out.println("Scrivere il simbolo dell'operazione da eseguire : ");
        char oper = in.next().charAt(0);
        return oper;
    }
    public static void outputMatrice(double[] arraySec, int dimension){
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
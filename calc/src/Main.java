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
        double[] arrayDiv = new double[dimension];

        System.out.println("Inserisci gli elementi che compongono l'array :");
        riempiArray(dimension, arrayDiv, in);

    }
    public static int getArrayLength(Scanner in) {
        System.out.println("Inserisci la dimensioni dell'array: ");
        int dimension;
        dimension = in.nextInt();
        return dimension;
    }

    public static void riempiArray(int dimension,double[] arrayDiv, Scanner in){
        for (int i = 0; i < dimension; i++) {
            arrayDiv[i] = in.nextDouble();
        }

        System.out.println("Posizione: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(i);
            System.out.print("   ");
        }
        System.out.println("  ");
        System.out.println("Valore: ");
        for (int i = 0; i < dimension; i++) {
            System.out.print(arrayDiv[i]);
            System.out.print(" ");
        }
        System.out.println("   ");

        double valUno;
        double valDue;

        System.out.println("Quali valori vuoi utilizzare: (max 2)");
        System.out.println("Indicare la posizione ");
        int x = in.nextInt();
        valUno = arrayDiv[x];
        System.out.println("Valore che hai scelto è:  " + valUno);
        int y = in.nextInt();
        valDue = arrayDiv[y];
        System.out.println("Valore che hai scelto è:  " + valDue);
        System.out.println("Scrivere il simbolo dell'operazione da eseguire : ");
        char oper = in.next().charAt(0);


        Operazione.whatOper(valUno,valDue, oper);  //richiamo del metodo per capire tipo di operazione

    }

}
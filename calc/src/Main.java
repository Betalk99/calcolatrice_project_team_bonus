import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = Input.input();
        MatrixValuesChooser.array(in);
    }

    public static void arrayFiller(int dimension, double[] arraySec, Scanner in) {
        for (int i = 0; i < dimension; i++) {
            arraySec[i] = in.nextDouble();
        }
        double firstValue = MatrixValuesChooser.firstValue(arraySec, in);
        double secondValue = MatrixValuesChooser.secondValue(arraySec, in);
        char oper = MatrixValuesChooser.whatOper(in);
        Operazione.whatOper(firstValue, secondValue, oper);  //richiamo del metodo per capire tipo di operazione
        MatrixValuesChooser.outputMatrice(arraySec, dimension);
        EvenOdd.evenOdd(firstValue, secondValue, in);
    }
}
public class Operazione {
    public static void whatOper(double x, double y, char oper){ //metodo per capire quale operazione
        switch (oper){
            case '+' :
                double addizione = Somma.somma(x,y);
                System.out.println("Il risultato dell'addizione è:  " + addizione);
                break;
            case '-' :
                double sottrazione = Sottrazione.sottrazione(x,y);
                System.out.println("Il risultato della sottrazione è:  " + sottrazione);
                break;
            case '*' :
                double result=Multiplication.moltiplicazione(x,y);
                System.out.println("Il risultato è: "+result);
                break;
            case '/' :
                Division.divisione(x,y);
                break;
            default:
                System.out.println("Operazione errata!");
                break;
        }
    }
}

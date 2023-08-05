import java.util.Scanner;

public class capocua15 {

    public static void main(String[] args) {
        //  Crea un programa que pida al usuario un número entero y determine
        //  si es un número capicúa. Un número capicúa es aquel
        //  que se lee igual de izquierda a derecha que de derecha a izquierda.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un nuemro entero positivo");
        int num = entrada.nextInt();
        if(num<0) {
            System.out.println("Numero inorrecto");
            return;
        }

    }
}


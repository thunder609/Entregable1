import java.util.Scanner;

public class numeroPosNegIgual06 {
    //  Escribe un programa que pida al usuario un número
    //  y verifique si es positivo, negativo o cemain
    public static void main(String[] args) {
        System.out.printf("Por favor ingrese  el numero!");
        Scanner digito = new Scanner(System.in);
        Integer   numero = digito.nextInt();
        if(numero==0){
            System.out.println("el Numero es 0");
            return;
        }
        if(numero>0){
            System.out.println("el numero es positivo");
            return;
        }
        System.out.println("El numero es negativo");
    }
}

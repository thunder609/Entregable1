import java.util.Scanner;

public class NumeroTabla07 {
    //            Crea un programa que pida al usuario un número entero
    //            positivo y muestre su tabla de multiplicar hasta el 10.
    public static void main(String[] args) {
        System.out.println("Escriba un Numero");
        Scanner numero = new Scanner(System.in);
        Integer digito = numero.nextInt();
        int result;
        System.out.println("La tabla del"+digito);
        for (int i=0;i<10;i++){
           result=i*digito;
            System.out.println(i+"x"+digito+"="+result);
        }

    }
}

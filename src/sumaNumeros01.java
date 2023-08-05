import java.util.Scanner;

public class sumaNumeros01 {
//    Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.
    public static void main(String[] args) {


        System.out.printf("operaciones Matematicas");
        System.out.printf("Por favor ingrese  el primer numero!");
        Scanner imput = new Scanner(System.in);
        Integer num1 = imput.nextInt();

        System.out.printf("Por favor ingrese  el segundo numero!");
     //   Scanner imput2 = new Scanner(System.in);
        Integer num2 = imput.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        System.out.println("la suma es: "+suma);
        System.out.println("la resta es: "+resta);
        System.out.println("la multipliacioon  es: "+multiplicacion);
        if ((num1 == 0) || (num2 == 0)) {
            System.out.println("Error al dividir entre 0: ");

            return;
        }
        int division = num1 / num2;


        System.out.println("la Division es: "+division);

    }

}

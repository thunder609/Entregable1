import java.util.Scanner;

public class numeroMayMen05 {
    public static void main(String[] args) {
        //        Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.
        System.out.printf("Mayor de dos Numeros Enteros");
        System.out.printf("Por favor ingrese  el primer numero!");
        Scanner imput = new Scanner(System.in);
        Integer num1 = imput.nextInt();

        System.out.printf("Por favor ingrese  el segundo numero!");

        Integer num2 = imput.nextInt();
        if(num1==num2){
            System.out.println("son Iguales el primero"+num1);
            System.out.println("con el segundo"+num2);
            return;
        }
        if(num1>num2) {
            System.out.println("El mayor es "+num1);
            return;
        }

        System.out.println("El mayor es "+num2);
    }
}

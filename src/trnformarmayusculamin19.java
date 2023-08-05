import java.util.Scanner;

public class trnformarmayusculamin19 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario su nombre
        // y luego lo imprima en mayúsculas y minúsculas
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = imput.next().toUpperCase();
        String minu = nombre.toLowerCase();

        System.out.println("ingresa tu nombre en Minuscula "+minu);
        System.out.println("ingresa tu nombre Mauscula en "+nombre);
    }
}
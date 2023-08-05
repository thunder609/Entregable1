import java.util.Scanner;

public class replacecaratrCadena24 {

    //Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa una palabra");
        String palabra = imput.nextLine();

        String nuevaOracion="";
     for (int x= 0; x <= palabra.length() - 1;  x++) {
         nuevaOracion = palabra.replace('a', 'p');



     }
        System.out.println(nuevaOracion);

    }
    }


import java.util.Scanner;

public class contadorPlabras23 {
    public static void main(String[] args) {
        //       Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene
        //Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra
        //Pide al usuario una frase y muestra cada palabra por separado
        //Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco
        //Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
        //Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
        //Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
        //Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.//
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa una oracion");
        String oracion = imput.nextLine();
        imput.close();
        int cant=0;
        for (int x = 0; x <= oracion.length() - 1; x++) {
            cant = oracion.split("\\s+|\n+ |,").length;

        }
        System.out.println(cant);
    }
}
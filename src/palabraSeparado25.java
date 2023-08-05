import java.util.Scanner;
//OJO
public class palabraSeparado25 {
    public static void main(String[] args) {
        //Pide al usuario una frase y muestra cada palabra por separado
        //Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco
        //Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente
        //Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.
        //Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.
        //Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.//

        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa una palabra");
        String palabra = imput.nextLine();
          String[] salida={};
        System.out.println(salida);

        String nuevaOracion = "";
        for (int x = 0; x <= palabra.length() - 1; x++) {
            nuevaOracion = palabra.split(" ")[0].trim();
        }
        System.out.println(nuevaOracion);
    }
}
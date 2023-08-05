import java.util.Scanner;

public class palindrome22 {
    public static void main(String[] args) {
        //Escribe un programa que solicite al usuario una frase y verifique si es
        // un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)
        //
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa una palabra");
        String nombre = imput.next();
        String no = nombre;

        String cadenainvertida = "";

        for (int x = nombre.length() - 1; x >= 0; x--) {
            cadenainvertida = cadenainvertida + nombre.charAt(x);


        }
          if( nombre.equals(cadenainvertida)==true){
              System.out.println("es Palindrome");
          }else{
              System.out.println("No es Palindrome");
          }

    }






    }





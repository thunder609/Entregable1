import java.util.Scanner;

public class cadenaCuenta21 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa tu cadena ");
        String cadenaText= imput.next();
        String cadenainvertida = "";
        System.out.println("ingresa un solo caracter ");
        Scanner entrada = new Scanner(System.in);
        char caract = entrada.next().charAt(0);
        int   cont=0;
        for (int x=0 ;x< cadenaText.length();x++){


         if(caract==cadenaText.charAt(x)){
             cont++;
         }

        }

        System.out.println(cont);




    }
    }


import java.util.Scanner;

public class numerosPrimos12 {
    public static void main(String[] args) {
        // Realiza un programa que pida al usuario un número entero y
        // determine si es un número primo o no
        System.out.println("por favor ingrese un Numero");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = 0;
        for (int i = 1; i <= a; i++) {

            if (a % i == 0) {

                c++;
            }
        }
                if (c <= 2) {
                    System.out.println("es primo");

                }
                else{
                    System.out.println("N primo");
                }



        }



    }




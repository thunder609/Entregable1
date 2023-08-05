import java.util.Scanner;

public class adivinarNumero08 {
    public static void main(String[] args) {
       // Realiza un programa que simule un juego de adivinar un número. El
        // programa debe generar un número aleatorio entre 1 y 100, y el usuario
        // debe adivinarlo. El programa debe indicar si el número ingresado es mayor
        // o menor que el número a adivinar.
        Scanner numero =  new Scanner(System.in);

        int max = 5;
        int min =0;
        System.out.println("Ingrese el tu numero de la suerte");
       int num=numero.nextInt();
       int digito=  (int)(Math.random() * max - min);
        if((digito>0) && (digito<100)){
            if(digito==num){
                System.out.println("ganaste ");
                return;
            }
            if(digito>num){
                System.out.println("El numero ganador "+digito+" es mayora tu numero"+num);
                return;
            }

                System.out.println("El numero ganador" +digito+ "es menora tu numero"+num);


        }
    }
}

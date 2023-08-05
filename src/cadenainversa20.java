import java.util.Scanner;

public class cadenainversa20 {
    public static void main(String[] args) {
        //Realiza un programa que solicite al
        // usuario una cadena y luego invierta su orden
        Scanner imput = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre= imput.next();
        String cadenainvertida = "";
         for (int x= nombre.length()-1;x>0;x--){
 cadenainvertida=cadenainvertida+ nombre.charAt(x);
         }
        System.out.println(cadenainvertida);





    }
}

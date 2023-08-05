import java.util.Scanner;

public class edadMayMen04 {
    public static void main(String[] args) {
        //  Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
        System.out.printf("Saber si eres mayor o menor de edad");
        System.out.printf("Por favor ingrese  la edad");
        Scanner edadentra = new Scanner(System.in);
        Integer edad =  edadentra.nextInt();
        if (edad<=18){
            System.out.println("Eres menor de edad: "+edad);
            return;
        }
           System.out.println("eres mayor de edad: "+edad);

    }
}

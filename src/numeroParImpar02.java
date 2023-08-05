import java.util.Scanner;

public class numeroParImpar02 {
    public static void main(String[] args) {
        System.out.printf("Saber si un Numero dado es par o impar");
        System.out.printf("Por favor ingrese  el numero!");
        Scanner imput = new Scanner(System.in);
        Integer num = imput.nextInt();
        if (num % 2 != 0) {
            System.out.println("ese numero es impar: "+num);
            return;
        }
        System.out.println("ese numero es  par: "+num);
    }
}

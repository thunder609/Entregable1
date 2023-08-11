// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        int resp ;
        do {

            System.out.println("vas a realizar alguna operacion");
             resp = sc.nextInt();
            int operation = sc.nextInt();
            int operacion = 0;
            System.out.println("Operacio0nes Matematicas: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Divide");
            System.out.println("Ingrese el primer dato");
            float dato1 = sc.nextFloat();
            System.out.println("Ingrese el primer dato 2");
            float dato2 = sc.nextFloat();
            float result = 0;
            switch (operation) {
                case 1:
                    result = cal.sumar(dato1, dato2);
                    System.out.println(result);
                    break;
                case 2:
                    result = cal.restar(dato1, dato2);
                    System.out.println(result);
                    break;
                case 3:
                    result = cal.multiplicar(dato1, dato2);
                    System.out.println(result);
                    break;
                case 4:
                    result = cal.dividir(dato1, dato2);
                    System.out.println(result);
                    break;
            }
        }
        while (resp != 1);
    }
}
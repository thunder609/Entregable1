import java.util.Scanner;

public class rangoNumerosPrimo17 {
    public static void main(String[] args) {
        //Pide al usuario dos números enteros y muestra todos los
        // números primos que se encuentran en ese rango.


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer valor del rango");
        int a = entrada.nextInt();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingresa el segundo valor del rango");
        int b = entrada.nextInt();

        int mayor = 0;
        int menor = 0;
        if (a > b) {
            mayor = a;
            menor = b;

        }
        if (a < b) {
            mayor = b;
            menor = a;
        }
        if(a==b){
            mayor=a;
            menor=b;
        }

        System.out.println("aqui menor" + menor);

        System.out.println("aqui mayorr" + mayor);
        for (int x = menor; x <= mayor; x++) {

            int contador = 0;
            for (int j = 2; j <= x; j++) {


                if (x % j == 0) {

                    contador++;
                }

                }
            if (contador > 1){
              //  System.out.println("No primo" + x);
                // System.out.println("No primo" + x);

            }else {
                System.out.println("si primo" + x);
            }
        }
    }



                }















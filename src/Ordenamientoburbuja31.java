import java.util.Scanner;

public class Ordenamientoburbuja31 {
    public static void main(String[] args) {
        // 31 Ordenamiento por burbuja dado un vector

        int numeros[] = new int[4];

        int[] ordenado;
        int temp = 0;
        //lectura
        for (int q = 0; q < numeros.length; q++) {
            Scanner p = new Scanner(System.in);
            System.out.println("ingresa el numero el la posicion "+q);
           int num = p.nextInt();
           numeros[q] = num;

        }
        //Ordenamiento
        for (int q = 0; q < numeros.length ; q++) {

            for (int k = 1;  k <(numeros.length-q);k++){
                if (numeros[k-1] > (numeros[k])) {
                    temp = numeros[k - 1];
                    numeros[k-1] = numeros[k];
                    numeros[k] = temp;

                }

            }
        }
      ordenado=numeros;
            //salida

        for (int y = 0; y < numeros.length; y++) {
            System.out.println(" de forma acendente" +numeros[y]);
        }

        }
    }

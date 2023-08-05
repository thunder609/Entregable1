import java.util.Scanner;

public class arregloFrecuencia32Y33 {
    public static void main(String[] args) {
        int numeros[] = new int[4];
        int c = 0;
        for (int q = 0; q < numeros.length; q++) {
            Scanner p = new Scanner(System.in);
            int num = p.nextInt();
            numeros[q] = num;

        }
        //frecuencia n un elemento en un vector
        for (int q = 0; q < numeros.length ; q++) {
            c = 0;
            for (int k = 0; k < numeros.length; k++) {
                if (numeros[q] == numeros[k]) {
                    c++;
                    numeros[q] = c;

                }
                System.out.println("veces" +
                        numeros[q]);

            }

            //32 buscar un elemento especifico en un arrglo y muetre su indice

              for (int k = 0; k < numeros.length ; k++){
                if(numeros[k]==10){
                    int pos=k;

                    System.out.println("se encontro="+pos);
                }


            }

    }
}}
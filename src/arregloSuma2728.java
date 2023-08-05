import java.util.Scanner;

public class arregloSuma2728 {
    //sumar lista de arreglo de enteros y el mayor Algoritmo 27 28
    public static void main(String[] args) {
        System.out.println("Ingresa Catind de Numeros");
        System.out.println("Por favor ingrese  el primer numero!");
        Scanner imput = new Scanner(System.in);
       int cantidad = imput.nextInt();
        int numeros[]= new int[cantidad];
        int suma=0,acu=0,mayor=0,aux;
        for (int i=0;i<cantidad;i++){
            Scanner num = new Scanner(System.in);
            int numero=num.nextInt();
            numeros[i]= numero;
            System.out.println("el vector : "+numeros[i]);
            acu = acu +numeros[i];
            if(numeros[i]>mayor){
                mayor=numeros[i];

            }
        }
        System.out.println("La suma elemtos de array es : "+acu);
        System.out.println("Mayor de array es : "+mayor);
    }


}

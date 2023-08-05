import java.util.Scanner;

public class numeroPerfecto14 {
    public static void main(String[] args) {
      //  Escribe un programa que solicite al usuario un número entero
        //  positivo y verifique si es un número perfecto. Un número
        //  perfecto es aquel cuya suma de sus divisores propios
        //  (excluyendo al propio número) es igual al número.
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa un numero mayor a 0 entero");
        int  num= entrada.nextInt();
   if(num<0){
       System.out.println("Numero Invalido");
       return;
   }
   int per=0;
       for (int i=1;i<num;i++){
           if(num%i==0){
               per= per + i;
           }

       }
        if(per == num){
            System.out.println("Es un numero perfecto");
            return;
        }
            System.out.println("No es Es un numero perfecto");
    }
}

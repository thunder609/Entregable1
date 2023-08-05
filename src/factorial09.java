import java.util.Scanner;

public class factorial09 {
    public static void main(String[] args) {
        //            Escribe un programa que solicite
        //            al usuario un número entero positivo y calcule su factorial.

        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese el numero para calcular el factorial");

        int num=numero.nextInt();
        if(num <0){
            System.out.println("Nmero Invalido");
                    return;
        }

        for (int i=1;i<=num+1;i++){
          int fact = num +(num*i);
            System.out.println(fact);
        }


    }

}

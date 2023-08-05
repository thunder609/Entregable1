import java.util.Scanner;

public class fibonacci16 {
    public static void main(String[] args) {
     //16 Realice un programa que calcule  imprima la serie fibonacci
     // hasta un numero dado ingresado por el usuario
        int n=20;
        int fibo=0;
        Scanner input = new Scanner(System.in);
        for (int i=3 ; i<n;i++){

             fibo=fibo + (i-1);
            System.out.println(fibo);

        }
    }
}

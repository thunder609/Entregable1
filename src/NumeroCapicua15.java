import java.util.Scanner;

public class NumeroCapicua15 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num = imput.nextInt();

        int centena = num / 100;
        int decena = (num % 100) % 10;
        int unidad = (num % 100) % 10;
        if (centena == unidad) {
            System.out.println("es Pacua");
        }
        else{
            System.out.println("no es Pacua" );
        }
    }

}
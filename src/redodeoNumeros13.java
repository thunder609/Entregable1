import java.util.Scanner;

public class redodeoNumeros13 {
    public static void main(String[] args) {

        System.out.println("por favor ingrese un  si es decimal colocar una coma ,");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float   redondeo=  Math.round(a);
        System.out.println("el redondeo es: "+redondeo);

    }
}

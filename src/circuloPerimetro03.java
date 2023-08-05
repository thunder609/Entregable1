import java.util.Scanner;

public class circuloPerimetro03 {
    public static void main(String[] args) {
        System.out.printf("Perimetro del circulo");
        System.out.printf("Por favor ingrese  el radio del circulo!");
        Scanner radio = new Scanner(System.in);
        Float r =  radio.nextFloat();
        double perimetro =  r *  2 *(Math.PI);
        System.out.println("el perimetr5o es :  "+perimetro);

    }
}

import java.util.Scanner;

public class heronTriangulo11 {
    public static void main(String[] args) {
        //           Escribe un programa que calcule el área de un
        //           triángulo utilizando la fórmula de Herón.
        //           El usuario debe ingresar las longitudes de los
        //           tres lados.
        System.out.printf("Fomula de Heron");
        System.out.printf("Por favor ingrese  el primer numero!");
        Scanner imput = new Scanner(System.in);
        System.out.printf("ingrese  el lado A");
       int a=imput.nextInt();
        System.out.printf("ingrese  el lado B");
        Scanner imput2 = new Scanner(System.in);
           int  b = imput2.nextInt();
        System.out.printf("ingrese  el lado B");
        Scanner imput3 = new Scanner(System.in);
       int c = imput3.nextInt();
         float s=((a+b+c)/2);
         float r =    (s*(s-a)*(s*(s-b))*(s*(s-c)));
         float area= (float) Math.sqrt(r);
        System.out.println("El area de Heron es"+s);
         System.out.println("El area de Heron e1s"+r);
         System.out.println("El area de Heron area"+area);






    }
}

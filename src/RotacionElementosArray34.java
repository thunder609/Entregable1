import java.util.Arrays;
import java.util.Scanner;

public class RotacionElementosArray34 {
    static Scanner sc = new Scanner(System.in);
    static int[] numeros;

    void rotarIzda(int pos){
        for(int i=1;i<=pos;i++){
            rotarIzda1Pos();
        }
    }

    void rotarIzda1Pos(){
        int temp = numeros[0];
        for(int i=0;i<numeros.length;i++){
            numeros[i] = numeros[i+1];
        }
        numeros[numeros.length-1] = temp;
    }

    void rotarDcha(int pos){
        for(int i=1;i<=pos;i++){ rotarDcha1Pos(); } } void rotarDcha1Pos(){ int temp = numeros[numeros.length-1]; for(int i=numeros.length-1; i>0; i--){
        numeros[i] = numeros[i-1];
    }
        numeros[0] = temp;
    }


    void visualizarArray(){
        System.out.println(Arrays.toString(numeros) + "\n");
    }

    void llenarArray(){
        for(int i=0;i<numeros.length;i++){
            //
            System.out.println("ingresa numero");
          int   num=sc.nextInt();
            numeros[i] =num;
        }
    }

    void inicializarArray(){
        int dimension = 0;
        while (dimension<1) {
            System.out.print("Dimensión del array: ");
            dimension = sc.nextInt();
            if(dimension<1){
                System.out.println("Dimensión no válida. Debe ser mayor de 0.\n");
            }
        }
        numeros = new int[dimension];
    }

    static int pedirNumRotaciones(){
        int numRotaciones = 0;
        while (numRotaciones<1) {
            System.out.print("Cantidad de rotaciones: ");
            numRotaciones = sc.nextInt();
            if(numRotaciones<1){
                System.out.println("Cantidad no válida. Debe ser mayor de 0.\n");
            }
        }
        return numRotaciones;
    }

    static int pedirSentido(){
        int sentido = 0;
        do {
            System.out.print("Introduce el sentido de la rotacion 1-izquierda / 2-derecha: ");
            sentido = sc.nextInt();
            if(!(sentido==1 || sentido==2)){
                System.out.println("Opción no valida\n");
            }
        } while (!(sentido==1 || sentido==2));

        return sentido;
    }

    //rotar los elemtos de un array
    public static void main(String[] args) {
        RotacionElementosArray34  rotar = new RotacionElementosArray34 ();

        rotar.inicializarArray();
        rotar.llenarArray();
        rotar.visualizarArray();

        int numRotaciones = pedirNumRotaciones();
        int opcion = pedirSentido();
        if(opcion==1){
            rotar.rotarIzda(numRotaciones);
        } else{
            rotar.rotarDcha(numRotaciones);
        }

        rotar.visualizarArray();


    }
}
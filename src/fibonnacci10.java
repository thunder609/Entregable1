public class fibonnacci10 {
    public static void main(String[] args) {
       // Ejercicio 10: Crea un programa que muestre los primeros 20
        // números de la serie Fibonacci. La serie Fibonacci
        // se forma sumando los dos números anteriores para obtener

        int n=20;
        for (int i=0 ; i<=n;i++){
           int  fibo=i + (i+1);
            System.out.println(fibo);

        }

    }
}

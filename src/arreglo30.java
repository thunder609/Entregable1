import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class arreglo30 {
    //Ejercicio 30
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<Integer>();

        // adicion elemntos a la lista
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1,2,2,3,3, 3, 7, 5, 4, 0, 7, 5 }));



        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        // elimina repetidos el metodo o libreria
        union.removeAll(b);
        System.out.print(" lista solo lose elementos que no se repiten");
        System.out.println(union);
    }
}

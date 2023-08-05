import java.util.Arrays;
import java.util.Scanner;
public class oracionOrdenar27 {
    public static void main(String[] args) {
        //Crea un programa que solicite al usuario una frase y luego muestre las
        // palabras ordenadas alfabéticamenteCrea
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un string: ");
        String input = scanner.nextLine();

        // Split the string into words
        String[] words = input.split(" ");
        Arrays.sort(words, (w1, w2) -> w1.compareToIgnoreCase(w2));
        // Print the array of words
        for (String word : words) {
            System.out.println(word);
        }

    }
}
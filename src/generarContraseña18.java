import java.util.Random;
import java.util.Scanner;

public class generarContraseña18 {
    public static void main(String[] args) {
        //Crea un programa que genere una contraseña aleatoria de 8
        // caracteres que contenga letras mayúsculas, letras
        // minúsculas y dígitos. Puedes utilizar la clase Math
        // para generar números aleatorios
        // y la clase String para manipular la contraseña.
int min=1, max=9;
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
String clave="";
for(int i=0;i<8;i++) {
    Scanner entrada =new Scanner(System.in);
    StringBuilder randomString = new StringBuilder();
    int randomIndex = random.nextInt(characters.length());
    char randomCharacter = characters.charAt(randomIndex);
    randomString.append(randomCharacter);

    System.out.print(randomString);
}

    }
}

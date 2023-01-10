import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array de las contraseñas: ");
        int tamanoArray = scanner.nextInt();
        System.out.print("Ahora la longitud de las contraseñas (si 0, se aplica por defecto 10): ");
        int longitudPasswords = scanner.nextInt();

        Password[] arrayPasswords = new Password[tamanoArray];
        boolean[] arrayFuerte = new boolean[tamanoArray];

        for (int i = 0; i < tamanoArray; i++) {

            if (longitudPasswords != 0) {
                arrayPasswords[i] = new Password(longitudPasswords);
            } else {
                arrayPasswords[i] = new Password(10);
            }
            arrayFuerte[i] = arrayPasswords[i].esFuerte();
        }

        for (int i = 0; i < tamanoArray; i++) {
            if (arrayFuerte[i]) {
                System.out.print("es fuerte");
            } else {
                System.out.print("es debil");
            }
            System.out.println(" -> " + arrayPasswords[i].getContrasena());
        }
    }
}
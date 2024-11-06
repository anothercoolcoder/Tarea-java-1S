import java.util.Scanner;
public class ejercicio25 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            do {
                System.out.println("Escriba un numero");
                numero = scanner.nextInt();

                switch (numero) {
                    case 1 -> System.out.println("Ha ingresado el numero Uno");
                    case 2 -> System.out.println("Ha ingresado el numero Dos");
                    case 3 -> System.out.println("Ha ingresado el numero Tres");
                    case 4 -> System.out.println("Ha ingresado el numero Cuatro");
                    case 5 -> System.out.println("Ha ingresado el numero Cinco");
                    case 6 -> System.out.println("Ha ingresado el numero Seis");
                    default -> {
                    }
                }

            } while (numero != 7);
            System.out.println("Has ingresado el numero 7. Fin del proceso");
        }
    }
}

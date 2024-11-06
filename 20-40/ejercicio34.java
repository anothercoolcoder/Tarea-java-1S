import java.util.Scanner;
public class ejercicio34 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un numero");
            int numero = scanner.nextInt();
            int cifra;

            while ( numero > 0) {
                cifra = numero % 10;
                numero = numero /10;
                
            }        

        }
    }
}

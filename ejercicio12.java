import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero");
        double a = scanner.nextInt();

        if (a == 1)
            System.out.println("Ha ingresado el numero Uno");
        else
            if (a== 2)
                System.out.println("Ha ingresado el numero Dos");
            else
                if (a== 3)
                System.out.println("Ha ingresado el numero Tres");
                else
                if (a== 4)
                System.out.println("Ha ingresado el numero Cuatro");
                else
                if (a== 5)
                System.out.println("Ha ingresado el numero Cinco");
                else
                System.out.println("Ha ingresado un numero distinto de el rango de 1 a 5");
                scanner.close();     
            }
}

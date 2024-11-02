import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un valor para N");
        int n = scanner.nextInt();
        for(int i = 0; i < n + 1; i++)
        if (i== 1)
        System.out.println("Primera iteracion (Hola mundo)");
        else
        System.out.println("Iteracion, " + i);
        scanner.close();
    }
}

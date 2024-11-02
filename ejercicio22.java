import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int valor = 0;
        for (int i = 1; i < 8; i++){
            System.out.println("Ingrese un valor para la variable, #"+ i);
            valor = scanner.nextInt();
            total = total + valor;
        }
        System.out.println("El resultado final es, "+ total);
        
        scanner.close();
    }
}

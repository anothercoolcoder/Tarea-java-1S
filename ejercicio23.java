import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double valor = 0;
        for (int i = 1; i < 8; i++){
            System.out.println("Ingrese un valor para la variable, #"+ i);
            valor = scanner.nextDouble();
            total = total + valor;
        }
        double promedio = total/7; 
        System.out.println("El promedio final es, "+ promedio);
        
        scanner.close();
    }
}

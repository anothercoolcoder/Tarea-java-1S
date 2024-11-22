import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Escriba un número para la tabla de multiplicar (" + (i + 1) + "/10): ");
            int tabla = sc.nextInt();
            numeros[i] = Math.abs(tabla); 
        }

        System.out.println("\n===== Tablas de Multiplicar =====\n");

        for (int fila = 0; fila < 2; fila++) {
            for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                for (int columna = 0; columna < 5; columna++) {
                    int indice = fila * 5 + columna; 
                    int numero = numeros[indice]; 
                    if (numero == 0) {
                        System.out.print("Todo número * 0 = 0\t\t"); 
                    } else {
                        System.out.print(numero + " * " + multiplicador + " = " + (numero * multiplicador) + "\t");
                    }
                }
                System.out.println(); 
            }
            System.out.println(); 
        }

        System.out.println("Programa finalizado.");
        sc.close();
    }
}

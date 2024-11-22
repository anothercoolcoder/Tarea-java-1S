import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        String[] tablasArriba = new String[5];
        String[] tablasAbajo = new String[5];
        Scanner sc = new Scanner(System.in);

        int indexArriba = 0;
        int indexAbajo = 0;

        while (indexArriba < 5 || indexAbajo < 5) {
            System.out.println("Escriba un número para la tabla de multiplicar: ");
            int tabla = sc.nextInt();
            tabla = Math.abs(tabla);  
            System.out.println("El valor absoluto de su número es: " + tabla);

            StringBuilder tablaResultado = new StringBuilder();
            if (tabla == 0) {
                tablaResultado.append("Todo número multiplicado por cero es cero.\n");
            } else {
                for (int i = 1; i <= 10; i++) {
                    tablaResultado.append(tabla)
                                  .append(" * ")
                                  .append(i)
                                  .append(" = ")
                                  .append(tabla * i)
                                  .append("\n");
                }
            }

            if (indexArriba < 5) {
                tablasArriba[indexArriba] = tablaResultado.toString();
                indexArriba++;
            } else if (indexAbajo < 5) {
                tablasAbajo[indexAbajo] = tablaResultado.toString();
                indexAbajo++;
            }
        }

        System.out.println("===== Tablas Arriba =====");
        for (String tabla : tablasArriba) {
            System.out.println(tabla);
        }

        System.out.println("===== Tablas Abajo =====");
        for (String tabla : tablasAbajo) {
            System.out.println(tabla);
        }

        System.out.println("Programa finalizado. Has ingresado 10 tablas de multiplicar.");
        sc.close();
    }
}

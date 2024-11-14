import java.util.Scanner;
public class hola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)

	System.out.println("ingrese la base: ");
	int base = sc.nextInt();
	System.out.println("ingrese la exponente: ");
	int exponente = sc.nextInt();
	
	System.out.println("El resultado es " +Math.pow(base, exponente)); 
    }
}

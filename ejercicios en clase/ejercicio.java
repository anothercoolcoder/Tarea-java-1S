import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Hello world");
        System.out.println("Digite un numero entero");
        int x = sc.nextInt();
        // 5
        System.out.println("El valor digitado es: " + x);
        if (x%2==0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero no es par");
        }
        int p=0;
        for (int i = 2; i <= (x/2); i++) {
            if (x % i == 0){
                p=p+1;
                
            }
            if (p=1){
                
            }

                
                        
               }  
        
        } 
    }

}

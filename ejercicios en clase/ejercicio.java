import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            
        System.out.println("Hello world. ");
        System.out.println("Enter a whole number: ");
        int x = sc.nextInt();

        // even number or not
        System.out.println("The value entered is: " + x);
        if (x%2==0){
            System.out.println("The number entered is even ");
        } else {
            System.out.println("The number entered is not even ");
        }
        // prime number
        int p=0;
        for (int i = 2; i <= (x/2); i++) {
            if (x % i == 0){
                p=p+1;
            }
        }
        if (p == 0){
            System.out.println("Is a prime number. ");
        }else {
            System.out.println("Is not a prime number. ");
        }
    }
    }
}

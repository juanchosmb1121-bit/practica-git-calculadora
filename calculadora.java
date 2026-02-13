import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora version principal");


        System.out.print("Numero 1: ");
        int a = sc.nextInt();

        System.out.print("Numero 2: ");
        int b = sc.nextInt();

        System.out.println("Suma = " + (a + b));
        System.out.println("Resta = " + (a - b));
        System.out.println("Multiplicacion = " + (a * b));
    }
}



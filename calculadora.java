import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora - suma");

        System.out.print("Numero 1: ");
        int a = sc.nextInt();

        System.out.print("Numero 2: ");
        int b = sc.nextInt();

        int resultado = a + b;

        System.out.println("Resultado = " + resultado);
    }
}

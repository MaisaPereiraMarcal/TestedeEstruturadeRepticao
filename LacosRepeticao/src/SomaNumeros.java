import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número N (limite da soma): ");
        int N = sc.nextInt();

        int somaTotal = 0; 
        
        for (int i = 1; i <= N; i++) {
          
            somaTotal += i; 
        }

        System.out.println("\n--- Resultado da Soma ---");
        System.out.println("A soma dos números de 1 até " + N + " é: " + somaTotal);

        sc.close();
    }
}
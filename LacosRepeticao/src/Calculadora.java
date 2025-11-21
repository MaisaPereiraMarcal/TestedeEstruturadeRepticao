import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){

          Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número : ");
        int N = sc.nextInt();

        

        for (int i = 1; i <= 10; i++) {
         int resultado = N * i;
         System.out.println(N + " x " + i + " = " + resultado);   
        }
        sc.close();
        }
        
}

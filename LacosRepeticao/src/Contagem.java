  
 import java.util.Scanner;

  public class Contagem{
  public static void main(String[] args){


      Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Insira um numero: ");
        int num = sc.nextInt();
        while(num < 100){
        System.out.println(num); // ESTA LINHA MOSTRA A CONTAGEM
        num++; // Forma abreviada de num = num + 1;
        }
    
        System.out.println("A contagem terminou em: " + num);
       
        sc.close();
    }}
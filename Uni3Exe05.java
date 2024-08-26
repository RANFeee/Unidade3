package Unidade3;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantos frangos tem na granja?");
        int qtdFrangos = teclado.nextInt();
        int peDireito = 4;
        int peEsquerdo = 7;
        int frango = peDireito + peEsquerdo;
        System.out.print("O preço total gasto na granja é de: " + frango * qtdFrangos);
        teclado.close();

    }
    
}

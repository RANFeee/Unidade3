package Unidade3;
import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        double quilo = 25.0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o peso do prato?");
        double pesoPrato = teclado.nextDouble() - 0.75;
        double valorPagar = pesoPrato * quilo;
        System.out.println("O valor a ser pago é: " + valorPagar);    
        teclado.close();
    }
    
}


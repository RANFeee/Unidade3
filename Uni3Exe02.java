package Unidade3;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe o valor do sapato: " );
        float valor = teclado.nextFloat();
        float multiplicacao = valor * 12;
        float desconto = multiplicacao / 100;
        System.out.println("");
        System.out.println("O valor do desconto é de R$ " + desconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + (valor - desconto));
       teclado.close();
    }
}

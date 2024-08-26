package Unidade3;

import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("infome um numero inteiro ate 3 digitos");
        int numero = teclado.nextInt();
        int centena = numero / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        System.out.printf("%s centena(s) %s dezenas(s) %s unidade(s)", centena , dezena , unidade);
        teclado.close();
    }
}

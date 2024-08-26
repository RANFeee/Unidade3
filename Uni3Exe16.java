package Unidade3;

import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o valor do troco:");
        int valorTroco = teclado.nextInt();
        int notasDeCem = valorTroco / 100;
        int notasDeDez = (valorTroco % 100)/10;
        int notasDeUm = valorTroco % 10;
        System.out.println("numere de notas de 100: "+ notasDeCem);
        System.out.println("numere de notas de 10: "+ notasDeDez);
        System.out.println("numere de notas de 1: "+ notasDeUm);
        teclado.close();
    }
    
}

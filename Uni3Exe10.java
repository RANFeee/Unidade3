package Unidade3;


import java.util.Scanner;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o cateto");
        double cateto1 = teclado.nextDouble();
        System.out.println("informe mais um cateto");
        double cateto2 = teclado.nextDouble();
        double cateto1AoQuadrado = Math.pow(cateto1,2);
        double cateto2AoQuadrado = Math.pow(cateto2,2);
        double hipotenusa = cateto1AoQuadrado + cateto2AoQuadrado;
        double raizQuadradaHipotenusa = Math.sqrt(hipotenusa);
        System.out.println("O comprimento da hipotenusa é: "+raizQuadradaHipotenusa);
        teclado.close();
    }
}

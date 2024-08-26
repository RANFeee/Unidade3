package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double pi = 3.14159;
        System.out.println("informe a altura da lata em centimetros:");
        double altura = teclado.nextDouble();
        System.out.println("informe o raio da lata em centimetros:");
        double raio = teclado.nextDouble();
        double area = pi * Math.pow(raio, 2) * altura;
        double volumeLata = area;
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("O volume da lata é: "+df.format(volumeLata)+" cm³");
        teclado.close();
    }
}

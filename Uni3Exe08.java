package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorDolar= 5.49;
        System.out.println("Deposite uma quantia em dolar:");
        double qtdDolar = teclado.nextDouble();
        double dolarEmReais = qtdDolar * valorDolar;
        DecimalFormat df = new DecimalFormat(".00");
        System.out.println("Você sacou: R$ "+ df.format(dolarEmReais));
        teclado.close();
    }
}

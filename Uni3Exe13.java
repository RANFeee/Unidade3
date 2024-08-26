package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe13 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double azulejoEstampado = 12.50;
    double altura = teclado.nextDouble();
    double comprimento = teclado.nextDouble();
    double qtdazulejosMQuadrado = 9;
    double areaParede = comprimento * altura;
    double area = areaParede * qtdazulejosMQuadrado;
    double precoGasto = azulejoEstampado * area;
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("o valor gasto é: R$ " + df.format(precoGasto));
    teclado.close();
}
}

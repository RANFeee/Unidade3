package Unidade3;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe a temperatura em Celcius:");
        double temperaturaEmC = teclado.nextInt();
        double F = (9.0/5.0) * temperaturaEmC + 32;
        System.out.println("a temperatura em Fahrenheit é: " + F + "°F");
        teclado.close();
    }
}

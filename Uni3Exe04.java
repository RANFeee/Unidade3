package Unidade3;

import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        double p1 = 5;
        double p2 = 3;
        double p3 = 2;
        double media =(p1*n1 + p2*n2 + p3*n3)/(p1 + p2 + p3);
        System.out.println("A média do aluno é: " + media);
        teclado.close();
    }
    
}

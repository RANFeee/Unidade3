package Unidade3;
import java.util.Scanner;
public class Uni3Exe01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("informe a base: ");
    double base = teclado.nextDouble();
    System.out.print("informe a altura: ");
    double altura = teclado.nextDouble();
    double area = base * altura;
    System.out.println("a area do terreno é: " + area);

    teclado.close();
    }
}

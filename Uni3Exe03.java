package Unidade3;
import java.util.Scanner;
public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o preço da gasolina:" );
        double precoGasolina = teclado.nextDouble();
        System.out.println("Quanto reais de gasolina voce deseja por no seu tanque?");
        double preco = teclado.nextDouble();
        double qtdLitros = preco/precoGasolina;
        System.out.println("A quantidade de litros é: "+ qtdLitros+"L");
        teclado.close();
    }
}

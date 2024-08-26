package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double latinhas = 0.35;
        double garrafas = 0.6;
        double litroes = 2;
        System.out.println("Quantas latinhas de 350ml voce deseja?");
        int qtdlatinhas = teclado.nextInt();
        double totalLatinhaMl = qtdlatinhas * latinhas;
        System.out.println("Quantas garrafas de 600ml voce deseja?");
        int qtdgarrafas = teclado.nextInt();
        double totalGarrafasMl = qtdgarrafas * garrafas;
        System.out.println("Quantas garrafas de 2 litros voce deseja?");
        int qtdlitroes = teclado.nextInt();
        double totalGarrafasLitros = qtdlitroes * litroes;
        double totalLitros = totalGarrafasLitros + totalGarrafasMl + totalLatinhaMl;
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("O total é de: " + df.format(totalLitros)+"L");
        teclado.close();

    }
    
}

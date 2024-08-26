package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double distancia = teclado.nextDouble();
        double tempo = teclado.nextDouble();
        double velocidadeMedia = distancia / tempo;
        double eficienciaAutomovel = 12.0;
        double combustivelGasto = distancia / eficienciaAutomovel;
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.printf("velocidade media: %s km/h\n" , df.format(velocidadeMedia) );
        System.out.printf("combustivel gasto na viagem: %s Litros" , df.format(combustivelGasto));
        teclado.close();
    }
}

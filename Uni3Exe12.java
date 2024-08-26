package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o nome do funcionario: ");
        String nome = teclado.next();
        System.out.println("informe as horas trabalhadas mensalmente:");
        double horas = teclado.nextDouble();
        System.out.println("informe o numero de dependentes:");
        int dependentes = teclado.nextInt();
        int precoPorDependentes = 60 * dependentes;
        double precoPorHora = 10 * horas;
        double porcentagemINSS = 8.5 / 100 ;
        double descontoINSS = porcentagemINSS * precoPorHora;
        double resultadoDescontoINSS = descontoINSS;
        double porcentagemImpostoRenda = 5.0 / 100 ;
        double descontoIpRenda = porcentagemImpostoRenda * precoPorHora;
        double resultadoIpRenda = descontoIpRenda;
        double descontoTotal = precoPorHora - (resultadoDescontoINSS + resultadoIpRenda);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Salario bruto: R$ " + df.format(precoPorHora + precoPorDependentes));
        System.out.println("Salario liquido: R$ "+ df.format(descontoTotal + precoPorDependentes));
        teclado.close();
    }
}

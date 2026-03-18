package org.vendedor;

//bibliotecas
import java.util.Scanner;

//formato padrão do perfil
class Profile {
    protected String user;
    protected double wageVal;
    protected double soldVal;
    protected double comPercent;

    //calculo da comissão
    public double comCalc() {
        return soldVal * (comPercent / 100.0);
    }
}

public class Main {
    public static void main(String[] args) {
        //utilizando a classe como template
        Profile vendedor = new Profile();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Vendedor: ");
        vendedor.user = scanner.next();

        System.out.print("Salário Fixo: ");
        vendedor.wageVal = scanner.nextDouble();

        System.out.print("Valor Recebido através de Vendas: ");
        vendedor.soldVal = scanner.nextDouble();

        System.out.print("Percentual da Comissão: ");
        vendedor.comPercent = scanner.nextDouble();

        scanner.close();

        //valor da comissão
        double comVal = vendedor.comCalc();

        //resultado
        System.out.println("\n" + vendedor.user +
                ", recebeu o seguinte salário fixo de " + vendedor.wageVal +
                ", e o valor da comissão recebida foi de " + comVal +
                " (" + (vendedor.wageVal + comVal) + ", Valor Total somado do salário total com a comissão.)"
        );
    }
}
package org.media;

//bibliotecas
import java.util.Scanner;

public class Main {

    //Calculo de media aritemtica
    public static Double calcMed(double nota1, double nota2, double nota3) {
        return ((nota1 + nota2 + nota3) / 3);
    }

    public static void main(String[] args) {
        //prompt
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Aluno: ");
        String user = scanner.next();

        System.out.print("Nota da Primeiro Prova: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota da Segunda Prova: ");
        double n2 = scanner.nextDouble();

        System.out.print("Nota da Terceira Prova: ");
        double n3 = scanner.nextDouble();

        scanner.close();

        //resultado
        Double res = calcMed(n1, n2, n3);
        System.out.println(
            "A media total do aluno " + user + " foi de " + String.format("%.2f", res) + " pontos"
        );
    }
}

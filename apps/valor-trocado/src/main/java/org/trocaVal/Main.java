package org.trocaVal;

//bibliotecas
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor da Variavel 'A': ");
        String val1 = scanner.nextLine();

        System.out.println("Valor da Variavel 'B': ");
        String val2 = scanner.nextLine();

        //valor temporario
        String tempVal;

        //troca de valores
        tempVal = val1;
        val1 = val2;
        val2 = tempVal;

        System.out.println("Agora a Variável 'A' possui o valor da Variavel 'B' e vice versa. " +
                "\nValor da Variável A: " + val1 +
                "\nValor da Variável B: " + val2
        );
    }
}

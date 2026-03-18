package org.calculadora;

//Bibliotecas
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Lista onde vai guardar a expressão do usuario
    static ArrayList<String> exp = new ArrayList<>();

    public static double calc(double n1, double n2, String op) {
        return switch (op) {
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> {
                if (n2 == 0) throw new ArithmeticException("Divisão por zero");
                yield n1 / n2;
            }
            default -> throw new IllegalArgumentException("Operador inválido");
        };
    }

    public static double result() {
        //Enquanto tiver valores na lista irá executar a função novamente
        while (exp.size() > 1) {
            //Variaveis
            double num1 = Double.parseDouble(exp.get(0)); //Primeiro numero
            String op = exp.get(1); //Operador
            double num2 = Double.parseDouble(exp.get(2)); //Segundo numero

            double res = calc(num1, num2, op);

            //Remove da lista
            exp.subList(0, 3).clear();

            //Adiciona resultado para o inicio da lista
            exp.add(0, String.valueOf(res));
        }
        return Double.parseDouble(exp.get(0)); //Resultado
    }

    public static void main(String[] args) {
        //prompt
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diga uma equacao: ");

        //Separa numero dos operadores
        String input = scanner.nextLine().replaceAll("\\s+", "");
        String[] tokens = input.split("(?<=[+\\-*/])|(?=[+\\-*/])");

        //Converte os valores da lista para um novo ArrayList
        for (String t : tokens) {
            exp.add(t);
        }

        //debug
        try {
            System.out.println("Resultado: " + String.format("%.2f", result()));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}

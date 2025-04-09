package exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada
        System.out.print("Temperatura em graus Celsius: ");
        double c = sc.nextDouble();

        Temperatura temperatura = new Temperatura(c);

        // saida
        System.out.println();
        System.out.println("Temperatura em Celsius: " + c + "ºC");
        System.out.println("Temperatura em Fahrenheit: " + temperatura.converF() + "ºF");
        System.out.println("Temperatura em Kelvin: " + temperatura.converK() + " K");
    }
}

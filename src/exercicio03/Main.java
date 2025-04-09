package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada
        System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Altura: ");
        int altura = sc.nextInt();

        Retangulo retangulo = new Retangulo(base, altura);

        // saida
        System.out.println();
        System.out.println("Área: " + retangulo.calculoArea());
        System.out.println("Perímetro: " + retangulo.calculoPeri());
    }
}

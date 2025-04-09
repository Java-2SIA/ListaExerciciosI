package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Cor: ");
        String cor = sc.nextLine();

        System.out.print("Número de marchas: ");
        int marchas = sc.nextInt();

        System.out.print("Valor: R$");
        double valor = sc.nextDouble();

        // Instanciando o objeto
        Bicicleta bicicleta = new Bicicleta(cor, marchas, valor);

        // Saída de dados
        System.out.println("\n--- Dados da bicicleta ---");
        bicicleta.mostrarDados();

        sc.close();
    }
}

package exercicio01;

public class Bicicleta {
    String cor;
    int numMarchas;
    double valor;

    // construtor
    public Bicicleta(String cor, int numMarchas, double valor) {
        this.cor = cor;
        this.numMarchas = numMarchas;
        this.valor = valor;
    }

    // método para mostrar os dados
    public void mostrarDados() {
        System.out.println("Cor: " + cor);
        System.out.println("Número de marchas: " + numMarchas);
        System.out.println("Valor: R$" + valor);
    }
}

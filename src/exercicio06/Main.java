package exercicio06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(20, 30, 5);
        Hora h2 = new Hora(344, 30, 0);
        Hora h3 = new Hora(5, 15, 3);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());
    }
}

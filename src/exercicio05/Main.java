package exercicio05;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Distancia[] distancia = new Distancia[3];

        // entrada de dados com valores aleatorios
        for (int i = 0; i < distancia.length; i++) {
            distancia[i] = new Distancia(Math.random()*50);
        }

        // saidade dados
        for (Distancia d : distancia){
            System.out.println("Distância em metros --> " + d.distancia);
            System.out.println("Distância em milhas --> " + d.paraMilhas());
            System.out.println("Dsitância em pés --> " + d.paraPes());
            System.out.println();
        }
    }
}

package exercicio05;

public class Distancia {
    double distancia;

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    // converter para pés
    public double paraPes(){
        return distancia * 3.28084;
    }

    //converter para milhas
    public double paraMilhas(){
        return distancia * 0.000621371;
    }

}

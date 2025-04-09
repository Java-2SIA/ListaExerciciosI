package exercicio04;

public class Temperatura {
    double c;
    double f;
    double k;

    public Temperatura(double c){
        this.c = c;
    }

    public double converF(){
        f = (9.0/5) * c + 32;
        return f;
    }

    public double converK(){
        k = c + 273;
        return k;
    }
}

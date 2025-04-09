package exercicio03;

public class Retangulo {
    int altura;
    int base;

    public Retangulo(int altura, int base){
        this.altura = altura;
        this.base = base;
    }

    public int calculoArea(){
        int area;
        area = base * altura;
        return area;
    }

    public int calculoPeri(){
        int perimetro;
        perimetro = 2 * (base + altura);
        return perimetro;
    }
}

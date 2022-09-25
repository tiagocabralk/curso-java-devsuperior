package exercicio1.entities;

public class Retangulo {
    public double largura;
    public double altura;

    public double Area() {
        return this.largura * this.altura;
    }

    public double Perimetro() {
        return 2 * (this.largura + this.altura);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
    }
}

package exercicio_polimorfismo.exercicio_03.entities;

public class PessoaFisica extends Pessoa{

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double impostoPago() {
        if (getRendaAnual() >= 20000.0) {
            return (getRendaAnual() * 25 / 100) - (getGastosSaude() * 50 / 100);
        } else {
            return getRendaAnual() * 15 / 100;
        }
    }
}

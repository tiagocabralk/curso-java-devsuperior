package exercicio_polimorfismo.exercicio_02.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return  getName()
                + " $ "
                + String.format("%.2f" , getPrice()+getCustomsFee())
                + " (Customs free: $ "
                + String.format("%.2f)" , getCustomsFee());
    }
}

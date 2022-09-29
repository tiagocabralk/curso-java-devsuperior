package exercicio_polimorfismo.exercicio_02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate mnufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate mnufactureDate) {
        super(name, price);
        this.mnufactureDate = mnufactureDate;
    }

    public LocalDate getMnufactureDate() {
        return mnufactureDate;
    }

    public void setMnufactureDate(LocalDate mnufactureDate) {
        this.mnufactureDate = mnufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return  getName()
                + " (used) $ "
                + String.format("%.2f" , getPrice())
                + " (Manufacture date: "
                + getMnufactureDate().format(formatter) + ")";
    }
}

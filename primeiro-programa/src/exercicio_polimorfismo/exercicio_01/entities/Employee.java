package exercicio_polimorfismo.exercicio_01.entities;

public class Employee {
    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee() {
    }

    public Employee(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public double payment() {
        return valuePerHour * hour;
    }

    @Override
    public String toString() {
        return name + " - $ " + payment();
    }
}

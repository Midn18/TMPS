package LAB1.prototype;

import lombok.Data;

@Data
public class PoliceCar implements Cloneable {
    private int id;
    private String mark;
    private String model;
    private int year;
    private String plateNumber;

    public PoliceCar(int id, String mark, String model, int year, String plateNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.plateNumber = plateNumber;
    }

    @Override
    public PoliceCar clone() throws CloneNotSupportedException {
        PoliceCar policeCar = (PoliceCar) super.clone();
        policeCar.plateNumber = this.plateNumber;
        return policeCar;
    }
}

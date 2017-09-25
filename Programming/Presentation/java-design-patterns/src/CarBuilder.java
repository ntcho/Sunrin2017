import java.awt.*;

public class CarBuilder {

    private int modelNumber;

    private String modelName;

    private Color color;

    private int horsePower;

    public CarBuilder(String modelName) {
        if (modelName == null) {
            throw new IllegalArgumentException("modelName can't be null");
        }
        this.modelName = modelName;
    }
    
    public CarBuilder modelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
        return this;
    }

    public CarBuilder modelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    public CarBuilder color(Color color) {
        this.color = color;
        return this;
    }

    public CarBuilder horsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public Color getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }
}

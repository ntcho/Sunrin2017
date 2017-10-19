import java.awt.*;

public class Car {

    private int modelNumber;

    private String modelName;

    private Color color;

    private int horsePower;

    public Car(int modelNumber, String modelName, Color color, int horsePower) {
        // original direct initializing object
        this.modelNumber = modelNumber;
        this.modelName = modelName;
        this.color = color;
        this.horsePower = horsePower;
    }

    public Car(CarBuilder carBuilder) {
        // initialize objects with builder pattern
        this.modelName = carBuilder.getModelName();
        this.modelNumber = carBuilder.getModelNumber();
        this.color = carBuilder.getColor();
        this.horsePower = carBuilder.getHorsePower();
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelNumber=" + modelNumber +
                ", modelName='" + modelName + '\'' +
                ", color=" + color +
                ", horsePower=" + horsePower +
                '}';
    }
}

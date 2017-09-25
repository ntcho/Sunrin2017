import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Car car1 = new CarBuilder("Volvo")
                .color(Color.RED)
                .horsePower(800)
                .modelNumber(224)
                .build();

        Car car2 = new CarBuilder("BMW")
                .color(Color.BLACK)
                .horsePower(500)
                .modelNumber(120)
                .build();

        Car car3 = new CarBuilder("Audi")
                .color(Color.BLUE)
                .horsePower(400)
                .build();

        Car cars[] = {car1, car2, car3};

        for (Car car : cars) {
            print(car.toString());
        }
    }

    private static void print(Object obj) {
        System.out.println(obj.toString());
    }
}
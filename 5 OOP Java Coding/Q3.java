import java.util.Scanner;

class Engine {
    int engine_no;
    int cc;

    public Engine(int engine_no, int cc) {
        this.engine_no = engine_no;
        this.cc = cc;
    }
}

class Car {
    Engine engine;
    String color;
    double price;

    public Car(Engine engine, String color, double price) {
        this.engine = engine;
        this.color = color;
        this.price = price;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter car details:");
        int engine_no = input.nextInt();
        int cc = input.nextInt();
        String color = input.next();
        double price = input.nextDouble();

        Engine carEngine = new Engine(engine_no, cc);
        Car car = new Car(carEngine, color, price);

        System.out.printf("%d %d %s %.2f\n",
                car.engine.engine_no, car.engine.cc,
                car.color, car.price);

        input.close();
    }
}

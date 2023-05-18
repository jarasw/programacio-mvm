package cat.institutmvm.ui;

import cat.institutmvm.entities.Truck;
import cat.institutmvm.entities.Car;
import cat.institutmvm.entities.Motorbike;
import java.util.Scanner;

public class Main {

    private final static String MSG_1 = "*****************************************************";
    private final static String MSG_2 = "**************** VEHICLE DEALER  ***************";

    private final static String MSG_4 = "";
    public static final String RESET_COLOR = "\u001B[0m";
    public static final String BLAU = "\u001B[36m";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        System.out.println(MSG_2);
        System.out.println(MSG_1);

        System.out.println(MSG_4);

        Truck t = new Truck("Mercedes", "AMG", "42312HKL", "2017", 25000, 4, 1);
        System.out.println(t.getBrand() + " " + t.getWheels() + " " + t.getTones());

        Car c = new Car("Seat", "Panda", "52300OKL", "2005", 30000, 4, BLAU);
        System.out.println(c.getBrand() + " " + c.getDoors() + " " + c.getColours());

        Motorbike m = new Motorbike("Fiat", "500", "42712HIL", "2000", 0, 20, true);
        System.out.println(m.getBrand() + " " + m.getCubicCentimeters() + " " + m.getSidecar());

        System.out.println(MSG_4);

    }
}

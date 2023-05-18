package cat.institutmvm.entities;

public final class Car extends Vehicles {

    public int doors;
    public String colours;

    public Car(String brand, String model, String licensePlate, String year, int kms, int doors, String colours) {
        super(brand, model, licensePlate, year, kms);
        this.setDoors(doors);
        this.setColours(colours);
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getColours() {
        return this.colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

}

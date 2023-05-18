package cat.institutmvm.entities;

public final class Truck extends Vehicles {

    public int wheels, tones;

    public Truck(String brand, String model, String licensePlate, String year, int kms, int wheels, int tones) {
        super(brand, model, licensePlate, year, kms);
        this.setWheels(wheels);
        this.setTones(tones);
    }

    public int getWheels() {
        return this.wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getTones() {
        return this.tones;
    }

    public void setTones(int tones) {
        this.tones = tones;
    }

    public String getBrand() {
        return brand;
    }

}

package cat.institutmvm.entities;

public abstract class Vehicles {

    public String brand, model, licensePlate, year;
    public int kms;

    public Vehicles(String brand, String model, String licensePlate, String year, int kms) {
        this.setBrand(brand);
        this.setModel(model);
        this.setLicensePlate(licensePlate);
        this.setYear(year);
        this.setKms(kms);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return this.licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getKms() {
        return this.kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }
}

package cat.institutmvm.entities;

public final class Motorbike extends Vehicles {

    public int cubicCentimeters;
    public boolean sidecar;

    public Motorbike(String brand, String model, String licensePlate, String year, int kms, int cubicCentimeters, boolean sidecar) {
        super(brand, model, licensePlate, year, kms);
        this.setCubicCentimeters(cubicCentimeters);
        this.setSidecar(sidecar);
    }

    public int getCubicCentimeters() {
        return this.cubicCentimeters;
    }

    public void setCubicCentimeters(int cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    public boolean getSidecar() {
        return this.sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }

}

package cat.institutmvm.entities;

public abstract class GestioUrgencia {

    public String DNI;

    public GestioUrgencia(String DNI) {
        this.setDNI(DNI);
    }

    public String getMotiu() {
        return this.DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

}

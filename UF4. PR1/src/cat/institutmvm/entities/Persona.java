package cat.institutmvm.entities;

public final class Persona extends GestioUrgencia {

    private String nom, cognoms, TSI;

    public Persona(String DNI, String nom, String cognoms, String TSI, String Motiu) {
        super(DNI);
        this.setNom(nom);
        this.setCognoms(cognoms);
        this.setTSI(TSI);
    }

    public String getNom() {
        return this.nom;
    }

    public String getCognoms() {
        return this.cognoms;
    }

    public String getTSI() {
        return this.TSI;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setTSI(String TSI) {
        this.TSI = TSI;
    }

    public String getDNI() {
        return DNI;
    }

}

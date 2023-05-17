package cat.institutmvm.entities;

import cat.institutmvm.utils.Methods;
import java.time.LocalDate;
import java.util.Random;

public final class Registre {

    private String data;
    private int nvlUrgencia;
    private final Random random;

    public Registre(int torn) {
        this.setData(data);
        this.setTorn(torn);
        this.setNvlUrgencia(nvlUrgencia);
        this.random = new Random();
    }

    public LocalDate getData() {
        LocalDate avui = Methods.dataActual();
        return avui;
    }

    public int getTorn() {
        return random.nextInt(50001);
    }

    public int getNvlUrgència() {
        return this.nvlUrgencia;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTorn(int torn) {
    }

    public void setNvlUrgencia(int nvlUrgencia) {
        this.nvlUrgencia = nvlUrgencia;
    }

    public int getNvlUrgencia() {
        return nvlUrgencia;
    }

}

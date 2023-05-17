package cat.institutmvm.utils;

import java.time.LocalDate;

public class Methods {

    public static void main(String[] args) {
        LocalDate avui = dataActual();
        System.out.println("Avui es: " + avui);
    }

//  Mètode per printar el dia actual automàticament
    public static LocalDate dataActual() {
        LocalDate avui = LocalDate.now();
        return avui;
    }
}

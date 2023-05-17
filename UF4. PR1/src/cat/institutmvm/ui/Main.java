package cat.institutmvm.ui;

import cat.institutmvm.entities.Persona;
import cat.institutmvm.entities.Registre;
import java.util.Scanner;

public class Main {

    private final static String MSG_1 = "*****************************************************";
    private final static String MSG_2 = "**************** GESTIÓ D'ÙRGENCIES ***************";
    private final static String MSG_3 = "Benvingut al servei d'atenció a urgències\n"
            + "A continuació exposa el motiu de la seva cita: ";
    private final static String MSG_4 = "";
    public static final String RESET_COLOR = "\u001B[0m";
    public static final String BLAU = "\u001B[36m";
    private final static String MSG_5 = "Introdueix el DNI del pacient: ";
    private final static String MSG_6 = "Introdueix el nom del pacient: ";
    private final static String MSG_7 = "Introdueix els cognoms del pacient: ";
    private final static String MSG_8 = "Introdueix el TSI del pacient: ";

    public static void main(String[] args) {

        System.out.println(MSG_1);
        System.out.println(MSG_2);
        System.out.println(MSG_1);

//        El pacient explica el seu cas (motiu)
        System.out.println(MSG_4);
        System.out.println(MSG_3);

        Scanner sc = new Scanner(System.in);
        String Motiu = sc.next();

        System.out.println(MSG_4);

//      La infermera introdueix les dades del pacient
        System.out.println(MSG_5);
        String DNI;

//      Do while fins que s'ingressi un DNI vàlid (9 caràcters)
        do {
            DNI = sc.nextLine();
//      Validem que l'entrada tingui només 9 caràcters
        } while (DNI.length() != 9);

        System.out.println(MSG_6);
        String Nom;

//      Do while fins que s'ingressi un nom sense caràcters numèrics
        do {
            Nom = sc.nextLine();
//      Validem que l'entrada contengui només lletres
        } while (!Nom.matches("[a-zA-Z]+"));

        System.out.println(MSG_7);
        String Cognoms;

        do {
            Cognoms = sc.nextLine();
//      Aquest while és igual al del nom, només que en el parèntesis[a-zA-Z] hi ha un espai després de la Z perquè sinó quan posava per exemple Batlle Llorens,
//      detectava un espai com caràcter no vàlid i ho tornava a demanar.
        } while (!Cognoms.matches("[a-zA-Z ]+"));

        System.out.println(MSG_8);
        String TSI;

//      Do while fins que s'ingressi una TSI vàlida (14 caràcters)
        do {
            TSI = sc.nextLine();
//      Validem que l'entrada tingui només 14 caràcters
        } while (TSI.length() != 14);

        System.out.println(MSG_4);
        Persona p = new Persona(DNI, Nom, Cognoms, TSI, Motiu);

        Registre r = new Registre(0);
        System.out.println(r.getData() + " " + r.getTorn() + " " + r.getNvlUrgencia() + " ");
        System.out.println(MSG_4);

        System.out.println("Dades del pacient\n"
                + "DNI: " + BLAU + p.getDNI() + RESET_COLOR + "\n"
                + "Nom: " + BLAU + p.getNom() + RESET_COLOR + "\n"
                + "Cognoms: " + BLAU + p.getCognoms() + RESET_COLOR + "\n"
                + "TSI (Targeta Sanitària Individual): " + BLAU + p.getTSI() + RESET_COLOR + "\n"
                + "Motiu de la visita: " + BLAU + Motiu + RESET_COLOR);
        System.out.println(MSG_4);
        System.out.println("Registre de visita\n"
                + "Data\t\tTorn\tDNI\t\tNivell\n"
                + r.getData() + "\t" + r.getTorn() + "\t" + p.getDNI() + "\t" + r.getNvlUrgencia());

    }
}

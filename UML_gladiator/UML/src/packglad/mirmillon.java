package packglad;

import java.util.ArrayList;
import java.util.Collection;

public class mirmillon extends gladiateur {
    /**
     * @attribute
     */
    private Integer poids;

    /**
     * @attribute
     */
    private static String c_type = "mirmillon";

    /**
     * @associates <{packglad.gladiateur}>
     */
    ArrayList ListeAgresseur;

    public mirmillon(String nom_gladiateur, Integer poids, Integer idg, Integer vie) {
       super(idg, nom_gladiateur, c_type, poids/2, vie);
       this.poids = poids;
    }

    public String Rapport() {
    }

    public void modifInit(Integer poids) {
    }
}

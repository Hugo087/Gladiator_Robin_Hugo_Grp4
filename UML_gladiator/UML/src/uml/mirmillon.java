package uml;

import java.util.Collection;

public class mirmillon extends gladiateur {
    /**
     * @attribute
     */
    private Integer poids;

    /**
     * @attribute
     */
    private static String c_type = mirmillon;

    /**
     * @associates <{uml.gladiateur}>
     */
    Collection ListeAgresseur;

    public mirmillon(String nom_gladiateur, Integer poids, Integer idg, Integer vie) {
    }

    public String Rapport() {
    }

    public void modifInit(Integer poids) {
    }
}

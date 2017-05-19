package uml;

import java.util.Collection;

public class Garme {
    /**
     * @attribute
     */
    private static Integer prochainida;

    /**
     * @associates <{uml.arme}>
     */
    Collection ListeArme;

    public static Collection listerArme() {
    }

    public static void ajouterArme(String nom_arme, Integer offensive, Integer defensive, Boolean dispo_mirmillon,
                                   Boolean dispo_retiaire) {
    }

    public static void supprimerArme(Integer ida) {
    }

    public static Integer nbArme() {
    }

    public static arme getArme(Integer ida) {
    }

    public static Collection listerArme(Boolean dispo_retaire, Boolean dispo_mirmillon) {
    }
}

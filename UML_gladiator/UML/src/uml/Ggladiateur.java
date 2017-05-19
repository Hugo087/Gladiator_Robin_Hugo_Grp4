package uml;

import java.util.Collection;

public class Ggladiateur {
    /**
     * @attribute
     */
    private static Integer vie_de_base;

    /**
     * @attribute
     */
    private static Integer prochainIdg;

    /**
     * @associates <{uml.gladiateur}>
     */
    Collection ListeGlad;

    public static void supprimerGladiateur(Integer idg) {
    }

    public static void DonnerArme(Integer ida, Integer idg) {
    }

    public static Collection listerGladiateur(Integer ide) {
    }

    public static void Desamer(Integer idg, Integer ida) {
    }

    public static Integer nbDeGladiateur() {
    }

    public static gladiateur getGladiateur(Integer idg) {
    }

    public static Collection listerGladiateur() {
    }

    public static void FaireRapport(Integer idg) {
    }

    public static void ajouterMirmillon(String nom_gladiateur, Integer poids, Integer ide_ethnie) {
        mirmillon mir = new mirmillon(nom_gladiateur, poids, prochainIdg, vie_de_base);
        Gethnie.ajouterGladiateur(prochainIdg, ide_ethnie);
        prochainIdg++;
    }

    public static void ajouterRetiaire(String nom_gladiateur, Integer agilité, Integer ide_ethnie) {
    }

    public static void Frapper(Integer idg_agresseur, Integer idg_agressé, Integer ida) {
    }

    public static void modifParamInit(Integer vie, Integer force, Integer poids, Integer agilite) {
    }

    public static void débutCombat() {
    }

    public void finCombat() {
    }
}

package packglad;

import java.util.ArrayList;
import java.util.Collection;

public class Ggladiateur {
    /**
     * @attribute
     */
    private static Integer prochainIdg = 1;

    /**
     * @attribute
     */
    private static Integer vie_de_base = 200;

    /**
     * @associates <{packglad.gladiateur}>
     */
    static ArrayList<gladiateur> ListeGlad;

    public static String FaireRapport(Integer idg) {
        
    }

    public static ArrayList listerGladiateur() {
        return ListeGlad;
    }

    public static void Desamer(Integer idg, Integer ida) {
        
    }

    public static Integer supprimerGladiateur(Integer idg) {
        for(int i = 0; i < ListeGlad.size(); i++){
            if(ListeGlad.contains(idg)){
                ListeGlad.remove(i);
            }
        }
        return idg;
    }

    public static void modifParamInit(Integer vie, Integer force, Integer poids, Integer agilite) {
    }

    public static Integer nbDeGladiateur() {
    }

    public static void Frapper(Integer idg_agresseur, Integer idg_agressé, Integer ida) {
        
    }

    public static void finCombat() {
    }

    public static Integer ajouterRetiaire(String nom_gladiateur, Integer agilité, Integer ide_ethnie) {
        gladiateur glad = new retiaire(nom_gladiateur, agilité, packglad.Ggladiateur.prochainIdg, vie_de_base);
        prochainIdg++;
        return prochainIdg - 1;
    }

    public static gladiateur getGladiateur(Integer idg) {
        
    }

    public static ArrayList listerGladiateur(Integer ide) {
    }

    public static void débutCombat() {
    }

    public static Integer ajouterMirmillon(String nom_gladiateur, Integer poids, Integer ide_ethnie) {
        gladiateur glad = new mirmillon(nom_gladiateur, poids, ide_ethnie, vie_de_base);
        prochainIdg++;
        return prochainIdg - 1;
    }

    public static String SalutGlad(Integer idg) {
    }

    public static void listerArme(Integer idg) {
    }

    public static ArrayList listerAgresseur(Integer idg) {
    }

    public static ArrayList declarerArme(Integer idg) {
    }
}

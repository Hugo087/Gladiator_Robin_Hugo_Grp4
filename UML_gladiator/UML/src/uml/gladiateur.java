package uml;

import java.util.Collection;

public abstract class gladiateur {
    /**
     * @attribute
     */
    private Integer force;

    /**
     * @attribute
     */
    private Integer idg;

    /**
     * @attribute
     */
    private String nom_gladiateur;

    /**
     * @attribute
     */
    private Integer vie;

    /**
     * @attribute
     */
    private String type;

    /**
     * @associates <{uml.arme}>
     */
    Collection ListeArme;

    public gladiateur(Integer idg, String nom_gladiateur, String type, Integer force, Integer vie) {
    }

    public void Frapper(gladiateur g, arme a) {
    }

    public void RecevoirArme(arme a) {
    }

    public String Salut() {
    }

    public void PerdreArme(arme a) {
    }

    public Collection DéclarerArme(arme a) {
    }

    public String Rapport() {
    }

    public void modifInit(Integer vie) {
    }
}

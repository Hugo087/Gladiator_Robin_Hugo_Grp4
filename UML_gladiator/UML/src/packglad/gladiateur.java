package packglad;

import java.util.ArrayList;
import java.util.Collection;

public abstract class gladiateur {
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
    private Integer force;

    /**
     * @attribute
     */
    private String type;

    /**
     * @attribute
     */
    private Integer idg;

    /**
     * @associates <{packglad.arme}>
     */
    ArrayList ListeArme;

    public gladiateur(Integer idg, String nom_gladiateur, String type, Integer force, Integer vie) {
        this.nom_gladiateur = nom_gladiateur;
        this.idg = idg;
        this.type = type;
        this.force = force;
        this.vie = vie;
    }

    public ArrayList DéclarerArme(arme a) {
        
    }

    public void Frapper(gladiateur g, arme a) {
        
    }

    public void modifInit(Integer vie) {
    }

    public String Rapport() {
    }

    public void PerdreArme(arme a) {
    }

    public String Salut() {
    }

    public void RecevoirArme(arme a) {
    }
}

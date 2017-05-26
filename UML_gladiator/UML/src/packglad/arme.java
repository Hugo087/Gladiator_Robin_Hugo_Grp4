package packglad;

public class arme {
    /**
     * @attribute
     */
    private Boolean dispo_retiaires;

    /**
     * @attribute
     */
    private Integer ida;

    /**
     * @attribute
     */
    private String nom_arme;

    /**
     * @attribute
     */
    private Integer offensive;

    /**
     * @attribute
     */
    private Boolean dispo_mirmillons;

    /**
     * @attribute
     */
    private Integer defensive;

    public arme(String nom_arme, Integer offensive, Integer defensive, Integer ida, Boolean dispo_mirmillon,Boolean dispo_retiraire) {
        this.nom_arme = nom_arme;
        this.offensive = offensive;
        this.defensive = defensive;
        this.ida = ida;
        this.dispo_mirmillons = dispo_mirmillon;
        this.dispo_retiaires = dispo_retiraire;
    }

    public Integer getIda() {
        return this.ida;
    }
}

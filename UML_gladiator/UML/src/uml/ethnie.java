package uml;

import java.util.Collection;

public class ethnie {
    /**
     * @attribute
     */
    private Integer ide;

    /**
     * @attribute
     */
    private String nom_ethnie;

    /**
     * @attribute
     */
    private Integer pointEthnier;

    /**
     * @associates <{uml.gladiateur}>
     */
    Collection ListeGlad;

    public ethnie(String nom_ethnie) {
    }

    public Collection listerGladiateur() {
    }

    public void ajouterPoints(Integer points) {
    }
}

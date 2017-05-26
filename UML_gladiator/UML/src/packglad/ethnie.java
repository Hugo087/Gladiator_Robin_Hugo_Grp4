package packglad;

import java.util.ArrayList;
import java.util.Collection;

public class ethnie {
    /**
     * @attribute
     */
    private String nom_ethnie;

    /**
     * @attribute
     */
    private Integer ide;

    /**
     * @attribute
     */
    private Integer point_ethnie;

    /**
     * @associates <{uml.gladiateur}>
     */
    ArrayList ListeGlad;


    public ethnie(String nom_ethnie, Integer ide) {
        this.nom_ethnie = nom_ethnie;
        this.ide = ide;
    }

    public ArrayList listerGladiateur() {
        return ListeGlad;
    }

    public void ajouterPoints(Integer points) {
        this.point_ethnie = this.point_ethnie + points;
    }

}

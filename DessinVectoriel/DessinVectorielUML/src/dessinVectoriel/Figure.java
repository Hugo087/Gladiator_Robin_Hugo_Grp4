package dessinVectoriel;

import java.awt.Color;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Figure {
    /**
     * @attribute
     */
    private Color couleurTrait = Color.BLACK;

    /**
     * @attribute
     */
    private Integer epaisseurTrait = 1;

    public Color getCouleurTrait() {
        return couleurTrait;
    }

    public void setCouleurTrait(Color c) {
        couleurTrait = c;
    }

    public Integer getEpaisseurTrait() {
        return epaisseurTrait;
    }

    public void setEpaisseurTrait(int n) {
        epaisseurTrait = n;
    }

    protected abstract Collection getPixels();

    public void deplacer(int deltaX, int deltaY) {
        Collection pixels = getPixels(); // Encore à faire
    }

    public abstract void redimensionner(double coeff);

    protected abstract void afficher(Graphics2D graphics);
}

package dessinVectoriel;

import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Collection;

public class Segment extends Figure {
    private Pixel extremite;
    private Pixel origine;

    public Segment(Pixel origine, Pixel extremite) {
        this.origine = origine;
        this.extremite = extremite;
    }

    public Segment(Pixel origine, int longueur) {
        this.origine = origine;
        this.extremite.setX(origine.getX() + longueur);
    }

    public Pixel getOrigine() {
        return origine;
    }

    public Pixel getExtremite() {
        return extremite;
    }

    public int getLongueur() {
        int distanceX;
        int distanceY;
        distanceX = Math.abs(origine.getX() - extremite.getX());
        distanceY = Math.abs(origine.getY() - extremite.getY());
        return (int) Math.round(Math.sqrt(distanceY * distanceY + distanceX * distanceX));
    }

    public void redimensionner(double coeff) {
        extremite.setX(extremite.getX() * (int)Math.floor(coeff));
    }

    public void afficher(Graphics2D graphics) {
        afficher(graphics);
        graphics.setColor(getCouleurTrait());
    }

    protected Collection getPixels() {
        Collection<Pixel> pixels = new ArrayList<Pixel>();
        pixels.add(origine);
        pixels.add(extremite);
        return pixels;
    }
}

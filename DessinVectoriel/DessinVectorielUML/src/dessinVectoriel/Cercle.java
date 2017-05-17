package dessinVectoriel;

import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Collection;

public class Cercle extends Surface {
    /**
     * @attribute
     */
    private int rayon;
    private Pixel centre;

    public Cercle(Pixel pix, int r) {
        centre = pix;
        rayon = r;
    }

    public int getRayon() {
        return rayon;
    }

    public int getDiametre() {
        return rayon * 2;
    }

    public Pixel getCentre() {
        return centre;
    }

    protected Collection getPixels() {
        Collection<Pixel> pixels = new ArrayList<Pixel>();
        pixels.add(centre);
        Pixel extremite = new Pixel(centre);
        extremite.setX(centre.getX() + rayon);
        extremite.setY(centre.getY());
        pixels.add(extremite);
        return pixels;
    }

    public void redimensionner(double coeff) {
        rayon = rayon * (int)Math.round(coeff);
    }

    public void remplir(Graphics2D graphics) {
        graphics.fillOval(centre.getX(), centre.getY(), rayon, 0);
    }

    public void afficher(Graphics2D graphics) {
        graphics.drawOval(centre.getX(), centre.getY(), rayon, 0);
        graphics.setColor(getCouleurFond());
        
    }
}

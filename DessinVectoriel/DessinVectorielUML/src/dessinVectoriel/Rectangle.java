package dessinVectoriel;

import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends Surface {
    /**
     * @attribute
     */
    private Integer longueur;

    /**
     * @attribute
     */
    private Integer hauteur;
    private Pixel origine;

    public Rectangle(Pixel origine, Integer longueur, Integer hauteur) {
        this.origine = origine;
        this.longueur = longueur;
        this.hauteur = hauteur;
    }

    public Integer getLargeur() {
        return hauteur;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public Pixel getOrigine() {
        return origine;
    }

    public Collection getCoins() {
        Collection<Pixel> coin = new ArrayList<Pixel>();
        coin.add(origine);
        Pixel Coins = new Pixel(origine);
        Coins.setX(origine.getX()+ longueur);
        Coins.setY(origine.getY());
        coin.add(Coins);
        Coins.setX(origine.getX());
        Coins.setY(origine.getY()+ hauteur);
        coin.add(Coins);
        Coins.setX(origine.getX()+ longueur);
        Coins.setY(origine.getY()+hauteur);
        coin.add(Coins);
        return coin;
    }

    protected Collection getPixels() {
        Collection<Pixel> pixels = new ArrayList<Pixel>();
        pixels.add(origine);
        Pixel extremite = new Pixel(origine);
        extremite.setX(origine.getX() + longueur);
        extremite.setY(origine.getY() + hauteur);
        pixels.add(extremite);
        return pixels;
    }

    public void redimensionner(double coeff) {
        this.hauteur = this.hauteur * (int)Math.round(coeff);
        this.longueur = this.longueur * (int)Math.round(coeff);
    }

    public void remplir(Graphics2D graphics) {
        graphics.fillRect(origine.getX(), origine.getY(), longueur , hauteur);
    }

    public void afficher(Graphics2D graphics) {
        graphics.drawRect();
        graphics.setColor(getCouleurTrait());
    }
}

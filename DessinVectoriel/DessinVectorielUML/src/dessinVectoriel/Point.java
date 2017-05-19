package dessinVectoriel;

import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Collection;

public class Point extends Figure {
    private Pixel pixel;

    public Point(Pixel p) {
        pixel = p;
    }

    public Point(int x, int y) {
        pixel = new Pixel(x, y);
    }

    public Pixel getPixel() {
        return pixel;
    }

    protected Collection getPixels() {
        Collection<Pixel> pixels = new ArrayList<Pixel>();
        pixels.add(pixel);
        return pixels;
    }

    public void redimensionner(double coeff) {
        pixel.setX(pixel.getX() * (int)Math.round(coeff));
        pixel.setY(pixel.getY() * (int)Math.round(coeff));
    }

    public void afficher(Graphics2D graphics) {
        afficher(graphics);
        graphics.setColor(getCouleurTrait());
    }
}

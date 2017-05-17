package dessinVectoriel;

import java.awt.Color;
import java.awt.Graphics2D;

public abstract class Surface extends Figure {
    /**
     * @attribute
     */
    private Color couleurFond;

    public Color getCouleurFond() {
        return couleurFond;
    }

    public void setCouleurFond(Color c) {
        couleurFond = c;
    }

    protected abstract void remplir(Graphics2D graphics);
}

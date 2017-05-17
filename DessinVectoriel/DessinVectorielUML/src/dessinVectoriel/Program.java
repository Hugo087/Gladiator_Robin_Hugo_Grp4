package dessinVectoriel;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.Graphics2D;

import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class MonPanel extends JPanel
{
    private Dessin dessin;
    
    public MonPanel(Dessin d)
    {
        this.dessin = d;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.dessin.afficher((Graphics2D) g);
    }
    
    @Override
    public Dimension getPreferredSize()
    {
        return new Dimension(500, 500);
    }
}

public class Program implements Runnable
{
    @Override public void run()
    {
        Dessin dessin = leDessin();
        JFrame f = new JFrame(dessin.toString());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new MonPanel(dessin));
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Program());
    }
        
    static Dessin leDessin()
    {                    
        Dessin d = new Dessin("dessin1", "SCR", LocalDateTime.now());
        Pixel p = new Pixel(250, 250);
/**/
        Cercle c1 = new Cercle(p, 100);
        c1.redimensionner(1.2);
        c1.setEpaisseurTrait(0);
        c1.setCouleurFond(Color.GREEN.darker());
        d.ajouter(c1);      

        Cercle c2 = new Cercle(p, 100);
        c2.setCouleurTrait(Color.BLACK);
        c2.setEpaisseurTrait(15);
        c2.setCouleurFond(Color.BLUE);
        d.ajouter(c2);
/**/
        Point p1 = new Point(0, 0);
        p1.deplacer(200, 200);
        p1.setCouleurTrait(Color.YELLOW);
        p1.setEpaisseurTrait(10);
        d.ajouter(p1);
/**/
        Segment s1 = new Segment(new Pixel(250, 150), new Pixel(250, 350));
        s1.setCouleurTrait(Color.BLACK);
        s1.setEpaisseurTrait(2);
        d.ajouter(s1);

        Segment s2 = new Segment(new Pixel(150, 250), 200);
        s1.setCouleurTrait(Color.BLACK);
        s1.setEpaisseurTrait(2);
        d.ajouter(s2);

        Rectangle r1 = new Rectangle(new Pixel(400, 400), 120, 60);
        r1.setCouleurTrait(Color.RED);
        r1.setEpaisseurTrait(5);
        r1.setCouleurFond(Color.ORANGE);
        r1.deplacer(-100, -50);
        d.ajouter(r1);

        Segment diagonale1 = new Segment(r1.getOrigine(), 
                        new Pixel(r1.getOrigine().getX() + r1.getLongueur(), r1.getOrigine().getY() + r1.getLargeur()));
        diagonale1.setCouleurTrait(Color.BLACK);
        diagonale1.setEpaisseurTrait(2);
        diagonale1.redimensionner(0.5);
        d.ajouter(diagonale1);

        Segment diagonale2 = new Segment(new Pixel(r1.getOrigine().getX() + r1.getLongueur(), r1.getOrigine().getY()), 
                                         new Pixel(r1.getOrigine().getX(), r1.getOrigine().getY() + r1.getLargeur()));
        diagonale1.setCouleurTrait(Color.BLACK);
        diagonale1.setEpaisseurTrait(2);
        diagonale2.redimensionner(2);
        d.ajouter(diagonale2);

        Rectangle r2 = new Rectangle(new Pixel(400, 400), 120, 60);
        r2.setCouleurTrait(Color.RED);
        r2.setEpaisseurTrait(5);
        r2.setCouleurFond(Color.ORANGE);
        r2.redimensionner(2);
        r2.deplacer(-350, -350);
        d.ajouter(r2);

        Rectangle r3 = new Rectangle(new Pixel(50, 50), 120, 60);
        r3.setCouleurTrait(Color.ORANGE);
        r3.setEpaisseurTrait(5);
        r3.setCouleurFond(Color.RED);
        r3.redimensionner(0.5);
        d.ajouter(r3);
/**/        
        return d;
    }
}
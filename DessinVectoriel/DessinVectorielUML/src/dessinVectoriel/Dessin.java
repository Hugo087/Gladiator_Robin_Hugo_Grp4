package dessinVectoriel;

import java.awt.BasicStroke;
import java.awt.Graphics2D;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    /**
     * @attribute
     */
    private String nomDessin;

    /**
     * @attribute
     */
    private String nomAuteur;

    /**
     * @attribute
     */
    private LocalDateTime dateCreation;

    /**
     * @associates <{dessinVectoriel.Figure}>
     */
    ArrayList<Figure> figures;

    public Dessin(String dessin, String auteur, LocalDateTime date) {
        nomDessin = dessin;
        nomAuteur = auteur;
        dateCreation = date;
        figures = new ArrayList<Figure>() ;
    }

    public String getNomDessin() {
        return nomDessin;
    }

    public void setNomDessin(String dessin) {
        nomDessin = dessin;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String auteur) {
        nomAuteur = auteur;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime date) {
        dateCreation = date;
    }

    public Collection getLesFigures() {
        return figures;
    }

    public void setLesFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public String toString() {
        return nomDessin + " " + nomAuteur + " " + dateCreation ;
    }

    public void afficher(Graphics2D graphics) {
        
        
    }

    public void ajouter(Figure f) {
        figures.add(f);
    }
}

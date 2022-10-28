package com.example.implementation;

import java.util.ArrayList;
import java.util.List;

public class Dessin implements Observer{
    private List<Figure> figures=new ArrayList<>();
    private Algorithme algorithme;

    public void ajouter(Figure figure){
        figures.add(figure);
    }
    public void supprimer(Figure figure){
        figures.remove(figure);
    }
    public void serialiser(){}
    public void afficher(String couleur_remplissage,String couleur_contour,Double epaisseur_contour){
        System.out.println("couleur de remplissage : "+couleur_remplissage+"\tcouleur de contour : "+couleur_contour+"\tepaisseur contour : "+epaisseur_contour);
        figures.stream().forEach(f->f.dessiner());
    }
}

package com.example.implementation;

public class Cercle extends Figure{
    private int r;
    private Point point;

    public Cercle(int r, Point point) {
        this.r = r;
        this.point = point;
    }


    @Override
    public void afficher(String couleur_remplissage, String couleur_contour, Double epaisseur_contour) {
        System.out.println("test cercle");
    }
    @Override
    public void dessiner() {
        String tab="";
        for (int i = 0; i < level; i++)tab+="\t";
        System.out.println(tab+point.toString()+"\tsurface : "+3.14*r*r+"\tperimetre : "+2*3.14*r);
    }
}

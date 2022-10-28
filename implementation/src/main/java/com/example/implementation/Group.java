package com.example.implementation;

import java.util.ArrayList;
import java.util.List;

public class Group extends Figure{
    private List<Figure> figures=new ArrayList<>();

    @Override
    public void dessiner() {
        String tab="";
        for (int i = 0; i < level; i++)tab+="\t";

        System.out.println(tab+"{");
        figures.stream().forEach(f->f.dessiner());
        System.out.println(tab+"}");
    }

    @Override
    public void afficher(String couleur_remplissage, String couleur_contour, Double epaisseur_contour) {
        System.out.println("test group");
    }
    public void add(Figure figure){
        figure.level=this.level+1;
        figures.add(figure);
    }
}

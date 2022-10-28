package com.example.implementation;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable{
    private List<Observer> observers=new ArrayList<>();

    private String couleur_remplissage;
    private String couleur_contour;
    private Double epaisseur_contour;

    public void setParams(String couleur_remplissage,String couleur_contour,Double epaisseur_contour){
        this.couleur_remplissage=couleur_remplissage;
        this.couleur_contour=couleur_contour;
        this.epaisseur_contour=epaisseur_contour;
        notifyObservers();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        observers.forEach(o->o.afficher(couleur_remplissage,couleur_contour,epaisseur_contour));
    }
}

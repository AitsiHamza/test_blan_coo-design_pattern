package com.example.implementation;

import java.util.List;

public class Parametrage implements Observable{
    private List<Observer> observers;

    private String couleur_remplissage;
    private String couleur_contour;
    private String epaisseur_contour;

    public void addObserver(){}
    public void removeObserver(){}
    public void notifyObserver(){}
}

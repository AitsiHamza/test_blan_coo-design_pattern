package com.example.implementation;

public class Rectangle extends Figure{
    private int l;
    private int h;
    private Point point;

    public Rectangle(int l, int h, Point point) {
        this.l = l;
        this.h = h;
        this.point = point;
    }

    @Override
    public void dessiner() {
        String tab="";
        for (int i = 0; i < level; i++)tab+="\t";
        System.out.println(tab+point.toString()+"\tsurface : "+l*h+"\tperimetre : "+2*(l+h));
    }
}

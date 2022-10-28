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
    public void add(Figure figure){
        figure.level=this.level+1;
        figures.add(figure);
    }
}

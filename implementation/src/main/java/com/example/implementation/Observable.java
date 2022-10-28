package com.example.implementation;

public interface Observable {
    void addObserver();
    void removeObserver();
    void notifyObserver();
}

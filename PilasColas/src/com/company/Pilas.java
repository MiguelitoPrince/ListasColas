package com.company;

import lsd.Nodo;

public class Pilas extends Cola {
    @Override
    public void elimar(){
        if(!estavacio()){
            Nodo ultimo = inicio;
            Nodo penultimo = null;
            while (ultimo.getSiguiente() !=null){
                penultimo= ultimo;
                ultimo= ultimo.getSiguiente();
            }
            penultimo.setSiguiente(null);
        }
    }
}

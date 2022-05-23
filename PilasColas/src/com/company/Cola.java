package com.company;
import lsd.Lista;
import lsd.Nodo;

public abstract class Cola extends Lista {
    @Override
    public void insertar(Object dato){
        if(estavacio()){
            Nodo nuevo = new Nodo(dato, null);
            inicio = nuevo;
        }else {
            Nodo ultimo = inicio;
            while (ultimo.getSiguiente() !=null){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo = new Nodo(dato, null);
            ultimo.setSiguiente(nuevo);
        }
    }

    public abstract void elimar();
}

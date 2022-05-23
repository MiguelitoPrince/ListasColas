package com.company;

import lsd.Nodo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        /*
        Nodo.Lista listp = new Nodo.Lista();
        listp.mostrar();

        listp.insertarInicio(8347);
        listp.insertarInicio(3554);
        listp.insertarInicio(222);
        listp.insertarInicio("info");
        listp.insertarInicio("miguel");
        listp.insertarInicio("marco");
        listp.insertarInicio("delgado");
        listp.insertarInicio("pongo");

        listp.mostrar();

        listp.eliminarInicio();
        listp.eliminarInicio();

        listp.mostrar();
        */

        //-----------------------------------------------------------------------

        // Lista_Doble_Enlaze lista_doble_enlaze = new Lista_Doble_Enlaze();
        // System.out.println(lista_doble_enlaze.Estavacia());
        // for (int i  = 20; i > 0; i--){
        //     lista_doble_enlaze.insertar(i);
        //  }
        //System.out.println(lista_doble_enlaze.Estavacia());
        //lista_doble_enlaze.mostrarAdelante();
//
        //lista_doble_enlaze.eliminar();

        ////lista_doble_enlaze.mostrarAtras();


        //------------------------------------------------------------------------------


        // Lista_Circular lista_circular = new Lista_Circular();
        //System.out.println(lista_circular.estaVacia());
        //System.out.println(lista_circular.tamaño());
        //for (int i = 1; i <= 12; i++){
        //   lista_circular.insertarFin(i);
        //}
        //lista_circular.mostrar();
        //System.out.println(lista_circular.tamaño());

        // lista_circular.mostrarCircular(2);



        //---------------------------------------------------------------------------------------


        /*
        Cola cola = new Cola();
        System.out.println(cola.estavacio());

        for (int i = 1; i <=5; i++){
            cola.insertar(i);
        }
        cola.mostrar();

        cola.eliminarInicio();
        cola.eliminarInicio();
        cola.mostrar();
        */
 


        Pilas pilas = new Pilas();
        System.out.println(pilas.estavacio());

        for(int i = 1; i<= 5; i++){
            pilas.insertar(i);
        }
        pilas.mostrar();

        pilas.elimar();
        pilas.elimar();
        pilas.elimar();
        pilas.mostrar();


    }

}

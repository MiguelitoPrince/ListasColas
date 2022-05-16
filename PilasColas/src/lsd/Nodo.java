package lsd;

public class Nodo {
    Object dato;
    Nodo siguiente;
    public Nodo(Object dato, Nodo siguiente){
        this.dato=dato;
        this.siguiente=siguiente;
    }
    public Object getDato(){
        return this.dato;
    }
    public void  setDato(Object dato){
        this.dato=dato;
    }
    public Nodo getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente=siguiente;
    }

    public static class Lista {
        Nodo inicio;

        public Lista(){
            this.inicio=null;
        }
        public boolean estavacio(){
            return inicio==null;
        }


        public int tamaño(){
            int contador = 1;
            Nodo aux=inicio;
            while (aux.getSiguiente() !=null){
                contador ++;
                aux=aux.getSiguiente();
            }
            if (contador != 0){
                contador ++;
            }
            return contador;
        }

        public Object ultinoDato(){
            Nodo aux = inicio;
            while (aux.getSiguiente() != null){
                aux=aux.getSiguiente();
            }
            return aux.getDato();
        }
        public void insertarInicio(Object dato){
            if(estavacio()){
                this.inicio = new Nodo(dato, null);
            }else {
                Nodo aux = inicio;
                this.inicio=new Nodo(dato, aux);
            }
        }

        public void eliminarInicio(){
            if (estavacio()){
                this.inicio= inicio.getSiguiente();
            }
        }
        public void mostrar(){
            if (estavacio()){
                System.out.println("esta vacio");
            }else {
                Nodo aux = inicio;
                while (aux != null){
                    System.out.print(aux.getDato()+" ");
                    aux = aux.getSiguiente();
                }
                System.out.println(" ");
            }
        }
    }
}

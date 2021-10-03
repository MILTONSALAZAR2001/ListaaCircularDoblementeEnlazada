package lcde;

public class Main {
    public static void main(String[] args) {
        ListaCircularDoblementeEnlazada listaCircularDoblementeEnlazada = new ListaCircularDoblementeEnlazada();
        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        for (int i = 10; i > 0 ; i--) {
            listaCircularDoblementeEnlazada.insertar(i);



        }
        System.out.println(listaCircularDoblementeEnlazada.estaVacia());
        listaCircularDoblementeEnlazada.mostrarAdelante();
        listaCircularDoblementeEnlazada.eliminar();
        listaCircularDoblementeEnlazada.eliminar();
        listaCircularDoblementeEnlazada.mostrarAdelante();
        listaCircularDoblementeEnlazada.mostrarAtras();



    }
}

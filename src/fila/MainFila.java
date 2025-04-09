package fila;

public class MainFila {

    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.inserir(40);
        fila.inserir(50);
        fila.imprimir();
        System.out.println("Tamanho: " + fila.getTamanho());

        fila.remover();
        fila.imprimir();
        System.out.println();

        fila.remover();
        fila.imprimir();
        System.out.println();

        fila.remover();
        fila.imprimir();
        System.out.println();

        fila.remover();
        fila.imprimir();
        System.out.println();

        fila.remover();
        fila.imprimir();

    }

}

package merge.fila;
import fila.Fila;

public class Teste {
    public static void main(String[] args) {
        Fila a = new Fila();
        Fila b = new Fila();

        a.inserir(1);
        a.inserir(3);
        a.inserir(5);
        a.inserir(7);
        a.inserir(9);

        b.inserir(2);
        b.inserir(4);
        b.inserir(6);
        b.inserir(8);
        b.inserir(10);

        Fila c = MergeFila.mergeFila(a, b);
        System.out.println("\nMergeVetor realizado:");
        c.imprimir();
    }
}

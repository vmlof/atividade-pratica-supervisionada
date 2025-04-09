package merge.fila;
import fila.Fila;

public class MergeFila {

    public static Fila mergeFila(Fila a, Fila b) {
        Fila c = new Fila();

        while (!a.vazia() && !b.vazia()) {
            if (a.getInicio().getDado() < b.getInicio().getDado()) {
                c.inserir(a.remover());
            } else {
                c.inserir(b.remover());
            }
        }
        while (!a.vazia()) {
            c.inserir(a.remover());
        }
        while (!b.vazia()) {
            c.inserir(b.remover());
        }
        return c;
    }

}

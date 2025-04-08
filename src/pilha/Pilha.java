package pilha;

public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    private boolean vazia() {
        return topo == null;
    }

    public void insere(int elemento) {
        No novoNo = new No(elemento);
        novoNo.setProximo(topo);
        topo = novoNo;
    }

    public int remove() {
        if(vazia()) {
            System.out.println("pilha vazia");
            return -1;
        }
        int noTopo = topo.getDado();
        topo = topo.getProximo();
        return noTopo;

    }

    public void imprime() {
        if (vazia()) {
            System.out.println("pilha vazia");
            return;
        }
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.getDado());
            atual = atual.getProximo();
        }
    }
}

package fila;

public class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    private boolean vazia() {
        return inicio == null && fim == null;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if(vazia()) {
            inicio = novoNo;
            fim = novoNo;
        }
        else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }

    public int remover() {
        if(vazia()) {
            System.out.println("fila vazia");
            return -1;
        }
        int elemento = inicio.getDado();
        inicio = inicio.getProximo();
        return elemento;
    }
    public void imprimir() {
        if(vazia()) {
            System.out.println("fila vazia");
        }
        No atual = inicio;
        while(atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
    }
}

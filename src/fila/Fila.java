package fila;

public class Fila {
    private No inicio;
    private No fim;
    private int tamanho;

    public Fila() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public boolean vazia() {
        return inicio == null && fim == null;
    }

    public int getTamanho() {
        return tamanho;
    }

    public No getInicio() {
        return inicio;
    }

    public void inserir(int elemento) {
        No novoNo = new No(elemento);
        if(vazia()) {
            inicio = novoNo;
            fim = novoNo;
            tamanho++;
        }
        else {
            fim.setProximo(novoNo);
            fim = novoNo;
            tamanho++;
        }
    }

    public int remover() {
        if(vazia()) {
            System.out.println("fila vazia");
            return -1;
        }
        int elemento = inicio.getDado();
        inicio = inicio.getProximo();
        tamanho--;

        if(inicio == null) {
            fim = null;
        }
        return elemento;
    }

    public No[] converterParaVetor() {
        No[] v = new No[tamanho];
        No atual = inicio;
        int i = 0;
        while(atual != null) {
            v[i++] = atual;
            atual = atual.getProximo();
        }
        return v;
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

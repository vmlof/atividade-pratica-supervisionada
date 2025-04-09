package merge.vetor;

import fila.Fila;
import fila.No;

public class Teste {
    public static void main(String[] args) {

        Fila a = new Fila();
        a.inserir(1);
        a.inserir(3);
        a.inserir(5);
        a.inserir(7);
        a.inserir(9);

        Fila b = new Fila();
        b.inserir(2);
        b.inserir(4);
        b.inserir(6);
        b.inserir(8);
        b.inserir(10);

        No[] vetorA = a.converterParaVetor();
        No[] vetorB = b.converterParaVetor();
        No[] vetorC = MergeVetor.mergeVetor(vetorA, a.getTamanho(), vetorB, b.getTamanho());
        int tamanhoC = (a.getTamanho() + b.getTamanho());

        System.out.println("\nMerge realizado: ");
        for(int i = 0; i < tamanhoC; i++){
            System.out.print(vetorC[i].getDado() + " ");
        }

    }
}

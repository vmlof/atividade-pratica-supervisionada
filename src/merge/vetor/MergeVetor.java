package merge.vetor;
import fila.No;

public class MergeVetor {

    public static No[] mergeVetor(No[] a, int tamanhoA, No[] b, int tamanhoB) {
        No[] c = new No[tamanhoA + tamanhoB];
        int posicaoA = 0;
        int posicaoB = 0;
        int posicaoC = 0;

        while(posicaoA < tamanhoA && posicaoB < tamanhoB) {
            if(a[posicaoA].getDado() <= b[posicaoB].getDado()) {
                c[posicaoC++] = a[posicaoA++];
            }
            else {
                c[posicaoC++] = b[posicaoB++];
            }
        }

        while(posicaoA < tamanhoA) {
            c[posicaoC++] = a[posicaoA++];
        }

        while(posicaoB < tamanhoB) {
            c[posicaoC++] = b[posicaoB++];
        }
        return c;
    }

}

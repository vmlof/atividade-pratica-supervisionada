package pilha;

public class MainPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.insere(1);
        pilha.insere(2);
        pilha.insere(3);
        pilha.insere(4);
        pilha.insere(5);
        pilha.imprime();
        System.out.println();

        pilha.remove();
        pilha.imprime();
        System.out.println();

        pilha.remove();
        pilha.imprime();
        System.out.println();

        pilha.remove();
        pilha.imprime();
        System.out.println();

        pilha.remove();
        pilha.imprime();
        System.out.println();

        pilha.remove();
        pilha.imprime();
        System.out.println();



    }

}

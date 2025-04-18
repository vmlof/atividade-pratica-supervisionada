package mergeComVetor;

import fila.Fila;
import fila.No;
import merge.vetor.MergeVetor;

import java.util.Scanner;

public class MainVetorMerge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- MergeFila com Fila Encadeada ---\n");
        System.out.println("REGRA: Insira os elementos na fila, de forma ordenada. ");
        System.out.println("Para encerrar a inserção, digite (-1).");
        System.out.println("Vetor A");
        Fila a = new Fila();

        int valor = 0;
        int anterior = 0;

        while(valor != -1) {
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
            if(valor != -1) {
                if(valor < anterior) {
                    System.out.println("valor inválido!");
                    return;
                }
                a.inserir(valor);
                anterior = valor;
            }
        }
        System.out.println();
        a.imprimir();
        System.out.println();

        int opcao = 0;

        do {
            System.out.println("\n1) inserir mais elementos\n2) remover\n3) iniciar Vetor B");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    int valorA;
                    int anteriorA = 0;

                    System.out.println("\nDigite um valor: :");
                    while (true) {
                        System.out.print("Digite um valor: ");
                        valorA = sc.nextInt();

                        if (valorA == -1) break;
                        if (valorA < anteriorA) {
                            System.out.println("valor inválido!");
                            return;
                        }

                        a.inserir(valorA);
                        anteriorA = valorA;
                    }
                    System.out.println("\nVetor A:");
                    a.imprimir();
                    break;

                case 2:
                    if (a.vazia()) {
                        System.out.println("vetor vazio.");
                    } else {
                        int removido = a.remover();
                        System.out.println("\nelemento removido: " + removido);
                        System.out.println("\nVetor A:");
                        a.imprimir();
                    }
                    break;

                case 3:
                    System.out.println("\nIniciando Vetor B:");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 3);

        Fila b = new Fila();
        int valorB = 0;
        int anteriorB = 0;

        while(valorB != -1) {
            System.out.print("Digite um valor: ");
            valorB = sc.nextInt();
            if(valorB != -1) {
                if(valorB < anteriorB) {
                    System.out.println("valor inválido!");
                    return;
                }
                b.inserir(valorB);
                anteriorB = valorB;
            }
        }
        System.out.println();
        b.imprimir();
        System.out.println();

        int opcaoB = 0;

        do {
            System.out.println("\n1) inserir mais elementos\n2) remover\n3) Realizar merge");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    int novoValorB = 0;
                    int novoAnteriorB = 0;

                    System.out.println("\nDigite os valores em ordem crescente (-1 para sair):");
                    while (true) {
                        System.out.print("Digite um valor: ");
                        novoValorB = sc.nextInt();

                        if (novoValorB == -1) break;
                        if (novoValorB < novoAnteriorB) {
                            System.out.println("valor inválido!");
                            return;
                        }

                        b.inserir(novoValorB);
                        novoAnteriorB = novoValorB;
                    }
                    System.out.println("\nVetor B:");
                    b.imprimir();
                    break;

                case 2:
                    if (b.vazia()) {
                        System.out.println("vetor vazio.");
                    } else {
                        int removido = b.remover();
                        System.out.println("\nelemento removido: " + removido);
                        System.out.println("\nVetor B:");
                        b.imprimir();
                    }
                    break;

                case 3:
                    System.out.println("\nIniciando merge...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 3);

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

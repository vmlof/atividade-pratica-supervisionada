package mergeComFila;

import fila.Fila;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Merge com Fila Encadeada\n");
        System.out.println("Insira os elementos na fila, de forma ordenada. ");
        System.out.println("Para encerrar a inserção, digite (-1).");
        System.out.println("Fila A");
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
            System.out.println("\n1) inserir mais elementos\n2) remover\n3) iniciar Fila B");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    int valorA;
                    int anteriorA = 0;

                    System.out.println("\nDigite os valores em ordem crescente (-1 para sair):");
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
                    System.out.println("\nFila A:");
                    a.imprimir();
                    break;

                case 2:
                    if (a.vazia()) {
                        System.out.println("fila vazia.");
                    } else {
                        int removido = a.remover();
                        System.out.println("\nelemento removido: " + removido);
                        System.out.println("\nFila A:");
                        a.imprimir();
                    }
                    break;

                case 3:
                    System.out.println("\nIniciando Fila B:");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 3);

        Fila b = new Fila();



    }
}

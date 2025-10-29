package Principal;

import Fila.Fila;
import Lista.Lista;
import Pilha.Pilha;

import java.util.Scanner;

class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Inserir na Lista");
            System.out.println("2 - Mostrar Lista");
            System.out.println("3 - Empilhar");
            System.out.println("4 - Desempilhar");
            System.out.println("5 - Mostrar Pilha");
            System.out.println("6 - Enfileirar");
            System.out.println("7 - Desenfileirar");
            System.out.println("8 - Mostrar Fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    lista.inserir(sc.nextInt());
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    System.out.print("Digite um valor: ");
                    pilha.empilhar(sc.nextInt());
                    break;
                case 4:
                    pilha.desempilhar();
                    break;
                case 5:
                    pilha.mostrar();
                    break;
                case 6:
                    System.out.print("Digite um valor: ");
                    fila.enfileirar(sc.nextInt());
                    break;
                case 7:
                    fila.desenfileirar();
                    break;
                case 8:
                    fila.mostrar();
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}


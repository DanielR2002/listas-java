package Fila;

public class Fila {
    private int[] elementos;
    private int inicio, fim, tamanho;

    public Fila() {
        elementos = new int[5];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < elementos.length) {
            elementos[fim] = valor;
            fim = (fim + 1) % elementos.length;
            tamanho++;
            System.out.println("Valor enfileirado!");
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public void desenfileirar() {
        if (tamanho > 0) {
            System.out.println("Valor removido: " + elementos[inicio]);
            inicio = (inicio + 1) % elementos.length;
            tamanho--;
        } else {
            System.out.println("Fila vazia!");
        }
    }

    public void mostrar() {
        System.out.print("Fila: ");
        if (tamanho == 0) {
            System.out.println("vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                int index = (inicio + i) % elementos.length;
                System.out.print(elementos[index] + " ");
            }
            System.out.println();
        }
    }
}

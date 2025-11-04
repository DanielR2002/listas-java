```mermaid
flowchart TD
    Principal[Principal.java]
    Interface[Interface.java]
    Lista[Lista.java]
    Pilha[Pilha.java]
    Fila[Fila.java]

    Principal --> Interface
    Interface --> Lista
    Interface --> Pilha
    Interface --> Fila

    Lista --> L1[inserir(valor)]
    Lista --> L2[mostrar()]

    Pilha --> P1[empilhar(valor)]
    Pilha --> P2[desempilhar()]
    Pilha --> P3[mostrar()]

    Fila --> F1[enfileirar(valor)]
    Fila --> F2[desenfileirar()]
    Fila --> F3[mostrar()]


## 🌳 Diagrama do Projeto

```mermaid
flowchart TD
    A[Principal.java] --> B[Interface.java]

    B --> C[Lista.java]
    B --> D[Pilha.java]
    B --> E[Fila.java]

    C --> C1[inserir(valor)]
    C --> C2[mostrar()]

    D --> D1[empilhar(valor)]
    D --> D2[desempilhar()]
    D --> D3[mostrar()]

    E --> E1[enfileirar(valor)]
    E --> E2[desenfileirar()]
    E --> E3[mostrar()]



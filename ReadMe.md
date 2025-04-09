# Estruturas de Dados: Pilha, Fila e Merge

Este projeto implementa estruturas de **pilha** e **fila** utilizando **listas encadeadas**, além de uma funcionalidade de **merge** (fusão) entre dois conjuntos ordenados. A fusão foi implementada de duas formas distintas: utilizando **filas** e **vetores**.

## 📁 Estrutura do Projeto

O projeto está organizado na seguinte estrutura de pastas dentro da pasta `src`:

```bash
src/
├── fila/
│   ├── No.java
│   ├── Fila.java
│   └── MainFila.java
│
├── pilha/
│   ├── No.java
│   ├── Pilha.java
│   └── MainPilha.java
│
├── merge/
│   ├── fila/
│   │   ├── MergeFila.java
│   │   └── Teste.java
│   └── vetor/
│       ├── MergeVetor.java
│       └── Teste.java
│
├── mergeComFila/
│   └── MainFilaMerge.java
│
└── mergeComVetor/
    └── MainVetorMerge.java

```

## ✅ Funcionalidades Implementadas

### 📌 Pilha (usando lista encadeada)

- **Classe:** `Pilha`
- **Testes:** `MainPilha`
- **Métodos principais:**
    - `insere(int valor)`
    - `remove()`
    - `imprime()`

### 📌 Fila (usando lista encadeada)

- **Classe:** `Fila`
- **Testes:** `MainFila`
- **Métodos principais:**
    - `insere(int valor)`
    - `remove()`
    - `imprime()`

### 🔁 Merge (fusão de dois conjuntos ordenados)

#### ✅ Usando Filas

- **Classe:** `MergeFila`
- **Testes:** `Teste`
- **Descrição:** Recebe duas filas ordenadas A e B, e gera uma terceira fila C também ordenada.

#### ✅ Usando Vetores

- **Classe:** `MergeVetor`
- **Testes:** `Teste`
- **Descrição:** Recebe dois vetores ordenados A e B, e gera um vetor C com os elementos mesclados de forma ordenada.

## 🧪 Executando os Testes

### Testar a **Fila**:

Execute o método `main` da classe:

```bash
src/fila/MainFila.java
```

### Testar a **Pilha**:

Execute o método `main` da classe:

```bash
src/pilha/MainPilha.java
```

### Testar **Merge com Filas** (interativo):

Execute o método `main` da classe:

```bash
src/mergeComFila/MainFilaMerge.java
```

### Testar **Merge com Vetores** (interativo):

Execute o método `main` da classe:

```bash
src/mergeComVetor/MainVetorMerge.java
```

## 🧑‍💻 Sobre a Interação com o Usuário

- Ao testar `MainFilaMerge` e `MainVetorMerge`, o usuário poderá **criar e/ou modificar** as estruturas A e B antes de realizar o merge.
- Durante as operações de remoção (fila e pilha), o programa informa qual foi o **elemento removido**.
- As estruturas podem ser modificadas dinamicamente pelo usuário.

## 💡 Observações

- Todas as estruturas foram implementadas **manualmente**, sem uso de bibliotecas prontas.
- A organização em pacotes facilita a separação de responsabilidades e o teste individual de cada componente.

# Projeto Java: Exemplo de uso de Command Context

Este projeto demonstra o uso do padrão **Command Context** em Java. A ideia central é encapsular comandos como objetos e permitir que eles sejam executados dentro de um contexto que armazena informações úteis durante o ciclo de vida da execução desses comandos.

## 📌 O que é Command Context?

O **Command Context** é um padrão de design que oferece um ambiente compartilhado para comandos que precisam trocar informações entre si ou acessar dados comuns durante a execução.

Ele é útil quando:

- Há a necessidade de **encapsular a execução de lógica** de forma desacoplada.
- Queremos **executar uma cadeia de comandos**, mantendo um contexto que armazena estado ou resultado parcial.
- Desejamos **reduzir o acoplamento entre os comandos** e a lógica que os coordena.

No Java, geralmente é implementado como um objeto que guarda variáveis, resultados intermediários, metadados, ou referências úteis que os comandos podem ler e modificar.

## 🧠 Estrutura do Projeto

O projeto contém as seguintes partes principais:


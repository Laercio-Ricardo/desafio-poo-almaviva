# 🐾 PetShop Simulator - Desafio POO Almaviva

Este é um sistema de gerenciamento de banho para Pet Shop desenvolvido em **Java**, focado nos pilares da Programação Orientada a Objetos (POO): **Encapsulamento, Abstração e Herança.**

O projeto simula o funcionamento de uma máquina de banho automatizada, controlando níveis de insumos e o estado de limpeza dos pets.

## 🚀 Funcionalidades

- **Controle de Insumos:** A máquina possui reservatórios de água (máx 30L) e shampoo (máx 10L).
- **Gestão de Estados:** Validação se o pet está na máquina e se a máquina precisa de higienização antes do próximo uso.
- **Segurança Lógica:** Impedimento de banhos caso os insumos estejam abaixo do nível crítico (10L de água / 2L de shampoo).
- **Interação:** Sistema preparado para integração com menus via terminal.

## 🛠️ Tecnologias Utilizadas

- **Java JDK 21** (ou superior)
- **IntelliJ IDEA**
- **Git/GitHub** para versionamento

## 🏗️ Estrutura do Código

- `PetLalazinho.java`: Classe de modelo que representa o animal, contendo nome e status de limpeza.
- `MaquinaDeBanho.java`: O "cérebro" do sistema, contendo as regras de negócio, gastos de materiais e travas de segurança.
- `Main.java`: Ponto de entrada da aplicação onde os testes e o fluxo do programa são executados.

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git](https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git)

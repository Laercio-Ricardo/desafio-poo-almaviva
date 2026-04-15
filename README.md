<div align="center">
  
# 🧼 LALAXP: PETSHOP AUTOMATION SYSTEM
  
### 🚀 Backend Challenge - Bootcamp Almaviva x LalaXP Ecosystem

**Arquitetura robusta para automação de banho pet, focada em segurança de dados e gestão de insumos.**

<br>

[![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Spring](https://img.shields.io/badge/Focus-Back--end-red?style=for-the-badge&logo=spring)](https://spring.io/)
[![Status](https://img.shields.io/badge/Status-Version_1.0_Stable-00d2ff?style=for-the-badge)](https://github.com/Laercio-Ricardo)
[![Dev](https://img.shields.io/badge/Developer-Laercio_Ricardo-green?style=for-the-badge&logo=github)](https://github.com/Laercio-Ricardo)

</div>

---

## 📖 O Projeto

O **PetShop Automation** é um simulador de backend que gerencia o ciclo de vida completo de um banho pet. Diferente de um sistema simples, ele implementa uma **Máquina de Estados** que valida a disponibilidade de recursos (água/shampoo) e o status de higiene do hardware antes de qualquer execução, prevenindo falhas críticas no "provisionamento" do serviço.

---

## ⚙️ Arquitetura de Software & Regras de Negócio

O sistema foi construído utilizando os pilares da **Programação Orientada a Objetos (POO)** para garantir um código limpo e fácil de escalar para futuras APIs.

<table align="center">
  <tr>
    <td align="center"><b>🛡️ Fail-Fast Validation</b><br>O sistema interrompe a execução imediatamente se detectar falta de insumos ou erros de null-pointer.</td>
    <td align="center"><b>🔄 State Management</b><br>Controle rigoroso do estado da máquina (Limpa vs. Suja) e ocupação de slots (Pet Interno).</td>
  </tr>
  <tr>
    <td align="center"><b>📊 Resource Logic</b><br>Cálculo matemático preciso de decréscimo de estoque a cada ciclo de banho finalizado.</td>
    <td align="center"><b>캡 Encapsulamento</b><br>Proteção de atributos sensíveis, permitindo alteração de dados apenas via métodos autorizados.</td>
  </tr>
</table>

---

## 🛠️ Stack Tecnológica

<div align="center">
  <img src="https://img.shields.io/badge/Java_SE-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Logic_Defense-Shield-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" />
</div>

---

## 📂 Estrutura do Sistema (Classes)

> [!NOTE]
> Seguindo as melhores práticas de Clean Code, a lógica foi separada em responsabilidades claras.

- **`PetLalazinho.java`**: Entidade que carrega o estado de limpeza e identificação do animal.
- **`MaquinaDeBanho.java`**: O "Core" do sistema. Contém todas as travas de segurança e o processamento dos insumos.
- **`Main.java`**: Interface via CLI (Command Line Interface) que simula o painel de controle do operador.

---

## 📡 Próximos Passos (Roadmap)

Este projeto é o alicerce para a evolução do ecossistema **LalaXP**. As próximas atualizações incluirão:
- [ ] Implementação de Banco de Dados H2 para persistência de estoque.
- [ ] Criação de endpoints REST com **Spring Boot**.
- [ ] Dockerização do sistema para deploy em nuvem.

---

## 🚀 Como Executar o Painel de Controle

1. Certifique-se de ter o **JDK 17** ou superior instalado.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git](https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git)

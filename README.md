<div align="center">
```text
  _____________________________________________________________
 /                                                             \
|    🐾  P E T S H O P    S I M U L A T O R    🐾               |
|    _____________________________________________________     |
|                                                              |
|    > Status: Operacional                                     |
|    > Sistema: Java POO                                       |
|    > Developer: Laércio Ricardo                              |
 \_____________________________________________________________/
  
  **Um sistema de automação de banho pet construído com Java de alta performance.**

  ![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Status](https://img.shields.io/badge/Status-Em_Desenvolvimento-00d2ff?style=for-the-badge)
  ![Dev](https://img.shields.io/badge/Developer-Laercio_Ricardo-green?style=for-the-badge&logo=github)

</div>

---

## 📖 Sobre o Projeto

O **PetShop Simulator** é a representação real de como a Programação Orientada a Objetos (POO) pode ser aplicada para resolver problemas de logística e automação. O sistema gerencia uma máquina de banho que controla desde o nível de shampoo até a higienização do hardware após o uso.

---

## ⚡ Diferenciais Técnicos (O que tem no código)

<table align="center">
  <tr>
    <td align="center"><b>🛡️ Encapsulamento</b><br>Proteção total dos atributos da máquina.</td>
    <td align="center"><b>⚙️ Lógica de Insumos</b><br>Cálculo real de gasto de água e shampoo.</td>
  </tr>
  <tr>
    <td align="center"><b>🚫 Travas de Segurança</b><br>Impedimento de erros via Null Checks.</td>
    <td align="center"><b>🧼 Auto-Higiene</b><br>Sistema de limpeza obrigatório pós-banho.</td>
  </tr>
</table>

---

## 🛠️ Tecnologias e Ferramentas

<div align="center">
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" />
  <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white" />
  <img src="https://img.shields.io/badge/Markdown-000000?style=for-the-badge&logo=markdown&logoColor=white" />
</div>

---

## 📂 Organização das Classes

> [!IMPORTANT]
> A estrutura foi pensada para ser escalável, separando a entidade (Pet) da lógica de serviço (Máquina).

- `PetLalazinho.java` → Onde a vida do animal acontece (Nome e Status).
- `MaquinaDeBanho.java` → Onde o "link" cai se não tiver estoque. Regras de negócio pesadas.
- `Main.java` → A central de comando que roda o sistema.

---

## 🚀 Como testar a máquina

```bash
# Clone o repositório
git clone [https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git](https://github.com/Laercio-Ricardo/desafio-poo-almaviva.git)

# No IntelliJ, dê o Run no arquivo Main.java

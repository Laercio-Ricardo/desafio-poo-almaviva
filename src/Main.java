import java.util.Scanner;

public class Main {

    private final static MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        var opcoes = -1;

        do {
            System.out.println("\n=======================  Escolha uma das opções   =======================");
            System.out.println("1 - Dar banho no seu PET");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar o nivel da água");
            System.out.println("5 - Verificar o nivel do shampoo");
            System.out.println("6 - Verificar se tem algum PET no banho");
            System.out.println("7 - Colocar PET para Banhar");
            System.out.println("8 - Retirar PET do Banho");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.print("Digite sua opção: ");

            opcoes = scanner.nextInt();

            switch (opcoes) {
                case 1:
                    // Chama a validação e o banho da sua regra de negócio
                    maquinaDeBanho.DarBanhoNoPet();
                    break;
                case 2:
                    maquinaDeBanho.adicionarAgua();
                    System.out.println("Tentativa de adicionar água realizada.");
                    break;
                case 3:
                    maquinaDeBanho.adicionarShampoo();
                    System.out.println("Tentativa de adicionar shampoo realizada.");
                    break;
                case 4:
                    // Puxa o número exato de água que está na outra classe
                    System.out.println("-> Nível atual de água: " + maquinaDeBanho.getAgua());
                    break;
                case 5:
                    // Puxa o número exato de shampoo
                    System.out.println("-> Nível atual de shampoo: " + maquinaDeBanho.getShampoo());
                    break;
                case 6:
                    // Verifica o boolean e responde pro usuário
                    if (maquinaDeBanho.hasPet()) {
                        System.out.println("-> Sim, a máquina está ocupada por um pet neste momento.");
                    } else {
                        System.out.println("-> A máquina está vazia.");
                    }
                    break;
                case 7:
                    // Chama o método estático ali embaixo para pedir o nome e instanciar
                    setPetInMaquinaDeBanho();
                    break;
                case 8:
                    maquinaDeBanho.retirarPet();
                    break;
                case 9:
                    maquinaDeBanho.limparMaquina();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 0 a 9.");
                    break;
            }

        } while(opcoes != 0);

        scanner.close();
    }

    public static void setPetInMaquinaDeBanho(){
        System.out.print("Informe o nome do PET: ");
        var name = scanner.next();

        // Instancia o objeto Pet com o nome digitado
        var pet = new PetLalazinho(name);

        // Envia o objeto pra dentro da máquina
        maquinaDeBanho.setPetLalazinho(pet);

        // A mensagem de erro ou sucesso será controlada pela própria máquina agora
    }
}
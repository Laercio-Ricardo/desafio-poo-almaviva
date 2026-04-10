public class MaquinaDeBanho {

    private boolean clean = true; // Precisa começar true pro primeiro pet entrar
    private int agua;
    private int shampoo;
    private PetLalazinho petLalazinho;

    public void DarBanhoNoPet() {
        // Se tentar dar banho sem pet, o programa estoura. O return mata o erro aqui.
        if (this.petLalazinho == null) {
            System.out.println("Erro: Máquina vazia.");
            return;
        }


        // Validação de estoque conforme a regra do exercício
        if (agua < 10 || shampoo < 2) {
            System.out.println("Falta água ou shampoo.");
            return;
        }

        petLalazinho.setClean(true);

        // Atualiza os níveis e o estado da máquina
        this.agua -= 10;
        this.shampoo -= 2;
        this.clean = false; // Máquina suja após o uso

        System.out.println("Banho finalizado no " + petLalazinho.getName());
    }

    public void adicionarAgua() {
        if (agua >= 30) {
            System.out.println("Capacidade máxima atingida.");
            return;
        }
        agua += 2;
    }

    public void adicionarShampoo() {
        if (shampoo >= 10) {
            System.out.println("Capacidade máxima atingida.");
            return;
        }
        shampoo += 2;
    }

    public int getAgua() { return agua; }
    public int getShampoo() { return shampoo; }

    public boolean hasPet() {
        return petLalazinho != null;
    }

    public void setPetLalazinho(PetLalazinho petLalazinho) {
        // Bloqueia entrada se a máquina não foi limpa
        if (!this.clean){
            System.out.println("Máquina suja. Realize a limpeza.");
            return;
        }

        // Evita sobreposição de pets
        if (hasPet()) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        this.petLalazinho = petLalazinho;
    }

    public void limparMaquina() {
        if (agua >= 3 && shampoo >= 1) {
            agua -= 3;
            shampoo -= 1;
            this.clean = true;
            System.out.println("Limpeza concluída.");
        } else {
            System.out.println("Estoque insuficiente para limpeza.");
        }
    }
}


class Proprietario extends Usuario {
    private int numeroPropriedades;

    public Proprietario(String nome, String email, String telefone, int numeroPropriedades) {
        super(nome, email, telefone);
        this.numeroPropriedades = numeroPropriedades;
    }

    public int getNumeroPropriedades() {
        return numeroPropriedades;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Proprietário: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Número de propriedades: " + getNumeroPropriedades());
    }
}

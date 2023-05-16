import java.util.ArrayList;
import java.util.List;

class Hospede extends Usuario {
    private List<Propriedade> propriedadesFavoritas;

    public Hospede(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.propriedadesFavoritas = new ArrayList<>();
    }

    public List<Propriedade> getPropriedadesFavoritas() {
        return propriedadesFavoritas;
    }

    public void adicionarPropriedadeFavorita(Propriedade propriedade) {
        propriedadesFavoritas.add(propriedade);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Hóspede: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Número de propriedades favoritas: " + propriedadesFavoritas.size());
    }
}
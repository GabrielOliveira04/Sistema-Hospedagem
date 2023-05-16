import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Propriedade {
    private String endereco;
    private int numeroQuartos;
    private double preco;
    private String descricao;
    private List<Reserva> reservas;
    private List<Avaliacao> avaliacoes;

    public Propriedade(String endereco, int numeroQuartos, double preco, String descricao) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
        this.descricao = descricao;
        this.reservas = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public double getAvaliacaoMedia() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }

        double totalNotas = 0.0;
        for (Avaliacao avaliacao : avaliacoes) {
            totalNotas += avaliacao.getNota();
        }

        return totalNotas / avaliacoes.size();
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }
}
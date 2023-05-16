    import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de propriedades
        Propriedade apartamento = new Apartamento("Rua A", 2, 2000.0, "Apartamento aconchegante");
        Propriedade casa = new Casa("Rua B", 3, 3000.0, "Casa espaçosa");

        // Criando instâncias de usuários
        Usuario proprietario = new Proprietario("João", "joao@example.com", "123456789", 2);
        Usuario hospede = new Hospede("Emmylly", "Emmylly@example.com", "987654321");

        // Adicionando propriedades favoritas ao hóspede
        ((Hospede) hospede).adicionarPropriedadeFavorita(apartamento);
        ((Hospede) hospede).adicionarPropriedadeFavorita(casa);

        // Imprimindo informações dos usuários
        proprietario.imprimirInformacoes();
        System.out.println();
        hospede.imprimirInformacoes();
        System.out.println();

        // Criando instância de reserva
    

     // ...

     // Crie as instâncias de propriedade e hospede
     Propriedade propriedadeReservada = new Propriedade("Rua jose", 2,1500, "very god");
     Hospede hospede2 = new Hospede("Gabriel","gabriel123@gotmail.com", "(83)42342342");

     // Crie a instância da reserva
     LocalDate dataCheckIn = LocalDate.of(2023, 5, 15);
     LocalDate dataCheckOut = LocalDate.of(2023, 5, 20);
     double precoTotal = 1000.0;
     Reserva reserva = new Reserva(propriedadeReservada, hospede2, dataCheckIn, dataCheckOut, precoTotal);


        // Adicionando reserva à propriedade
        apartamento.getReservas().add(reserva);

        // Imprimindo informações da reserva e da propriedade
        System.out.println("Informações da reserva:");
        System.out.println("Propriedade: " + reserva.getPropriedadeReservada().getEndereco());
        System.out.println("Hóspede: " + reserva.getHospede().getNome());
        System.out.println("Check-in: " + reserva.getDataCheckIn());
        System.out.println("Check-out: " + reserva.getDataCheckOut());
        System.out.println("Preço total: " + reserva.getPrecoTotal());
        System.out.println();

        System.out.println("Informações da propriedade:");
        System.out.println("Endereço: " + apartamento.getEndereco());
        System.out.println("Número de quartos: " + apartamento.getNumeroQuartos());
        System.out.println("Preço: " + apartamento.getPreco());
        System.out.println("Descrição: " + apartamento.getDescricao());
        System.out.println();

        // Criando instância de avaliação
        Avaliacao avaliacao = new Avaliacao(apartamento, (Hospede) hospede, 4, "Ótima experiência!");

        // Adicionando avaliação à propriedade
        apartamento.getAvaliacoes().add(avaliacao);

        // Imprimindo média das avaliações da propriedade
        System.out.println("Média das avaliações da propriedade: " + apartamento.getAvaliacaoMedia());
    }
}

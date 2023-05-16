import java.time.LocalDate;




class Reserva {
    private Propriedade propriedadeReservada;
    private Hospede hospede;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private double precoTotal;

    public Reserva(Propriedade propriedadeReservada, Hospede hospede, LocalDate dataCheckIn, LocalDate dataCheckOut, double precoTotal) {
        this.propriedadeReservada = propriedadeReservada;
        this.hospede = hospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.precoTotal = precoTotal;
    }

    public Propriedade getPropriedadeReservada() {
        return propriedadeReservada;
    }

    public void setPropriedadeReservada(Propriedade propriedadeReservada) {
        this.propriedadeReservada = propriedadeReservada;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}

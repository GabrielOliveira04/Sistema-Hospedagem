class Avaliacao {
    private Propriedade propriedadeAvaliada;
    private Hospede hospede;
    private int nota;
    private String comentario;

    public Avaliacao(Propriedade propriedadeAvaliada, Hospede hospede, int nota, String comentario) {
        this.propriedadeAvaliada = propriedadeAvaliada;
        this.hospede = hospede;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Propriedade getPropriedadeAvaliada() {
        return propriedadeAvaliada;
    }

    public void setPropriedadeAvaliada(Propriedade propriedadeAvaliada) {
        this.propriedadeAvaliada = propriedadeAvaliada;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}

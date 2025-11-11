package model;

public class Palestra extends Evento {
    private String palestrante;
    private String emailPalestrante;
    private String instituicao;

    public Palestra(String titulo, java.time.LocalDate data, double duracao, double orcamento, Local local,
                    String palestrante, String emailPalestrante, String instituicao) {
        super(titulo, data, duracao, orcamento, local);
        this.palestrante = palestrante;
        this.emailPalestrante = emailPalestrante;
        this.instituicao = instituicao;
    }

    public String getPalestrante() { return palestrante; }
}

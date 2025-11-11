package model;

public class Seminario extends Evento {
    private String tema;
    private String aluno;
    private String orientador;

    public Seminario(String titulo, java.time.LocalDate data, double duracao, double orcamento, Local local,
                     String tema, String aluno, String orientador) {
        super(titulo, data, duracao, orcamento, local);
        this.tema = tema;
        this.aluno = aluno;
        this.orientador = orientador;
    }

    public String getTema() { return tema; }
}

package model;

import java.time.LocalDate;

public abstract class Evento {
    private String titulo;
    private LocalDate data;
    private double duracao;
    private double orcamento;
    private Local local;

    public Evento(String titulo, LocalDate data, double duracao, double orcamento, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.local = local;
    }

    public String getTitulo() { return titulo; }
    public LocalDate getData() { return data; }
    public double getDuracao() { return duracao; }
    public double getOrcamento() { return orcamento; }
    public Local getLocal() { return local; }
}
//
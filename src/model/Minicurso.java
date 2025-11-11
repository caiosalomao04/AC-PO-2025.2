package model;

import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private List<String> materiais;

    public Minicurso(String titulo, java.time.LocalDate data, double duracao, double orcamento, Local local,
                     List<Instrutor> instrutores, List<String> materiais) {
        super(titulo, data, duracao, orcamento, local);
        this.instrutores = instrutores;
        this.materiais = materiais;
    }

    public List<Instrutor> getInstrutores() { return instrutores; }
    public List<String> getMateriais() { return materiais; }
}
//
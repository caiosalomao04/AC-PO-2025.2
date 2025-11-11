package model;

public class Auditorio extends Local {
    private boolean som;
    private boolean traducao;

    public Auditorio(String nome, int capacidade, String bloco, boolean som, boolean traducao) {
        super(nome, capacidade, bloco);
        this.som = som;
        this.traducao = traducao;
    }

    public boolean hasSom() { return som; }
    public boolean hasTraducao() { return traducao; }
}
//
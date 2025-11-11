package model;

public class Laboratorio extends Local {
    private int computadores;
    private String tipo; // "informática" ou "química"

    public Laboratorio(String nome, int capacidade, String bloco, int computadores, String tipo) {
        super(nome, capacidade, bloco);
        this.computadores = computadores;
        this.tipo = tipo;
    }

    public int getComputadores() { return computadores; }
    public String getTipo() { return tipo; }
}

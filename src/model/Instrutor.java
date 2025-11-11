package model;

public class Instrutor extends PessoaResponsavel {
    private String formacao;
    private String area;

    public Instrutor(String nome, String email, String formacao, String area) {
        super(nome, email);
        this.formacao = formacao;
        this.area = area;
    }

    public String getFormacao() { return formacao; }
    public String getArea() { return area; }
}
//
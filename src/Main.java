import model.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ====== LOCAIS ======
        Sala sala101 = new Sala("Sala 101", 30, "Bloco A", 101, true);
        Auditorio aud1 = new Auditorio("Auditório Central", 200, "Bloco B", true, true);
        Laboratorio labInformatica = new Laboratorio("Laboratório de Informática", 25, "Bloco C", 25, "informática");

        // ====== PESSOAS RESPONSÁVEIS ======
        Instrutor profAna = new Instrutor("Ana Paula", "ana@uni.edu", "Mestre em Computação", "IA");
        Instrutor profJoao = new Instrutor("João Mendes", "joao@uni.edu", "Doutor em Redes", "Segurança da Informação");

        // Organizadores
        Organizador org1 = new Organizador("Bruno Silva", "bruno@uni.edu", "Coordenador Geral");
        Organizador org2 = new Organizador("Paula Nunes", "paula@uni.edu", "Responsável por inscrições");

        // ====== EVENTOS ======
        Palestra palestra = new Palestra(
                "Tendências em Inteligência Artificial",
                LocalDate.of(2025, 5, 10),
                2.0,
                800.0,
                aud1,
                "Dr. Carlos Lima",
                "carlos@tech.ai",
                "TechLab"
        );

        Minicurso mini = new Minicurso(
                "Introdução a Python",
                LocalDate.of(2025, 5, 11),
                4.0,
                500.0,
                labInformatica,
                Arrays.asList(profAna, profJoao),
                Arrays.asList("Apostila", "Slides", "Códigos")
        );

        Seminario sem = new Seminario(
                "Pesquisas em IoT",
                LocalDate.of(2025, 5, 12),
                3.0,
                300.0,
                sala101,
                "IoT e Sustentabilidade",
                "Lucas Ferreira",
                "Prof. Joana Lima"
        );

        // ====== PARTICIPANTES ======
        Participante p1 = new Participante("Marina Souza", "123.456.789-00", "marina@uni.edu", "Engenharia");
        Participante p2 = new Participante("Pedro Gomes", "987.654.321-00", "pedro@uni.edu", "Sistemas de Informação");
        Participante p3 = new Participante("Júlia Martins", "321.654.987-00", "julia@uni.edu", "Design");

        // ====== SAÍDA DE TESTE ======
        System.out.println("===== SISTEMA DE GESTÃO DE EVENTOS ACADÊMICOS =====\n");

        System.out.println(">> Evento 1: " + palestra.getTitulo());
        System.out.println("Local: " + palestra.getLocal().getNome());
        System.out.println("Palestrante: " + palestra.getPalestrante() + "\n");

        System.out.println(">> Evento 2: " + mini.getTitulo());
        System.out.println("Instrutores: ");
        for (Instrutor i : mini.getInstrutores()) {
            System.out.println(" - " + i.getNome() + " (" + i.getArea() + ")");
        }
        System.out.println("Materiais: " + mini.getMateriais() + "\n");

        System.out.println(">> Evento 3: " + sem.getTitulo());
        System.out.println("Tema: " + sem.getTema());
        System.out.println("Aluno: Lucas Ferreira\n");

        System.out.println("Organizadores: ");
        System.out.println(" - " + org1.getNome() + " (" + org1.getFuncao() + ")");
        System.out.println(" - " + org2.getNome() + " (" + org2.getFuncao() + ")\n");

        System.out.println("Participantes inscritos:");
        System.out.println(" - " + p1.getNome() + " (" + p1.getCurso() + ")");
        System.out.println(" - " + p2.getNome() + " (" + p2.getCurso() + ")");
        System.out.println(" - " + p3.getNome() + " (" + p3.getCurso() + ")");
    }
}
//
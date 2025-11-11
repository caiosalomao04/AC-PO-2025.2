import model.*;
import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Sala sala101 = new Sala("Sala 101", 30, "Bloco A", 101, true);
        Auditorio aud1 = new Auditorio("Auditório Central", 200, "Bloco B", true, true);
        Laboratorio labInformatica = new Laboratorio("Lab Info", 25, "Bloco C", 25, "informática");

        Instrutor profAna = new Instrutor("Ana Paula", "ana@uni.edu", "Mestre em Computação", "IA");
        Instrutor profJoao = new Instrutor("João Mendes", "joao@uni.edu", "Doutor em Redes", "Segurança");

        Palestra palestra = new Palestra(
                "Tendências em IA",
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

        Participante p1 = new Participante("Marina Souza", "123.456.789-00", "marina@uni.edu", "Engenharia");
        Participante p2 = new Participante("Pedro Gomes", "987.654.321-00", "pedro@uni.edu", "Sistemas");

        System.out.println("Evento: " + palestra.getTitulo());
        System.out.println("Local: " + palestra.getLocal().getNome());
        System.out.println("Participante exemplo: " + p1.getNome());
    }
}

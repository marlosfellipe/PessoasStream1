import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Lucas", 23, "Brasilia"),
                new Pessoa("Enzo", 23, "Brasilia"),
                new Pessoa("Mavi", 1, "Paris"),
                new Pessoa("João", 24, "Brasilia"),
                new Pessoa("Gabriel dos Santos", 23, "Brasilia"),
                new Pessoa("Marcela", 2, "Brasilia"),
                new Pessoa("Marlos", 26, "Brasilia"),
                new Pessoa("German", 4, "Florianopolis"),
                new Pessoa("Jose", 25, "Brasilia"),
                new Pessoa("Takeo", 28, "São Paulo"),
                new Pessoa("Natan", 5, "Brasilia"),
                new Pessoa("Neymar", 32, "São Paulo"),
                new Pessoa("negoney", 13, "Rio de janeiro"),
                new Pessoa("Roger", 40, "São Paulo"),
                new Pessoa("Maisa bom dia e cia", 14, "São Paulo"),
                new Pessoa("Lebron", 38, "Los Angeles"),
                new Pessoa("Fallen", 29, "Rio de Janeiro"),
                new Pessoa("Antonio", 1, "Brasilia"),
                new Pessoa("Rafael", 30, "Brasilia"),
                new Pessoa("Richard", 29, "Brasilia"),
                new Pessoa("Gabriel", 24, "Tocantins"),
                new Pessoa("Rickson", 29, "Brasilia"),
                new Pessoa("Maria Joaquina", 15, "São Paulo")
        );

        Map<String, Long> contagemPorCidade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade, Collectors.counting()));

        contagemPorCidade.forEach((cidade, contagem) ->
                System.out.println(cidade + ": " + contagem + " pessoa(s)")

        );

        System.out.println("\n");


        Map<String, List<Pessoa>> pessoasPorCidade = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade));

        pessoasPorCidade.forEach((cidade,lista) -> {
            System.out.println("Cidade: " + cidade);
            lista.forEach((System.out::println));
            System.out.println();
        });


        List<String> maioresDeIdade = pessoas.stream()
                .filter(p -> p.getIdade() >= 18)
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .map(p -> p.getNome().toUpperCase())
                .collect(Collectors.toList());




        maioresDeIdade.forEach(System.out::println);






    }
}
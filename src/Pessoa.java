public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;

    Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade(){
        return cidade;
    }


        @Override
        public String toString(){
            return nome + " (" + idade + " anos, " + cidade + ")";
        }
    }


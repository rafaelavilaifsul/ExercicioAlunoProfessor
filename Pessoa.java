class Pessoa {
    // atributos
    private String nome;
    private String dataNascimento;

    // construtor
    public Pessoa(String umNome, String umaDataNascimento) {
        this.nome = umNome;
        this.dataNascimento = umaDataNascimento;
    }

    // retorna o nome da pessoa
    public String getNome() {
        return this.nome;
    }

    // toString
    public String toString() {
        return this.nome + ", nascido em " + this.dataNascimento;
    }
}
class Aluno {
    // atributos
    private String nome;
    private String turma;

    // construtor
    public Aluno(String umNome, String umaTurma) {
        this.nome = umNome;
        this.turma = umaTurma;
    }

    // retorna o nome do aluno
    public String getNome() {
        return this.nome;
    }

    // retorna a turma do aluno
    public String getTurma() {
        return this.turma;
    }
}
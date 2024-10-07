class Aluno extends Pessoa {
    // atributos
    private String turma;

    // construtor
    public Aluno(String umNome, String umaDataNascimento, String umaTurma) {
        super(umNome, umaDataNascimento);
        this.turma = umaTurma;
    }

    // retorna a turma do aluno
    public String getTurma() {
        return this.turma;
    }

    // toString
    public String toString() {
        return super.toString() + ", aluno da turma " + this.turma;
    }
}
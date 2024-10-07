class Aluno extends Pessoa {
    // atributos
    private String turma;

    // construtor
    public Aluno(String umNome, String umaTurma) {
        super(umNome);
        this.turma = umaTurma;
    }

    // retorna a turma do aluno
    public String getTurma() {
        return this.turma;
    }
}
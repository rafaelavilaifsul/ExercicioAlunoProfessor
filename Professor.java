class Professor extends Pessoa {
    // atributos
    private String area;

    // construtor
    public Professor(String umNome, String umaDataNascimento, String umaArea) {
        super(umNome, umaDataNascimento);
        this.area = umaArea;
    }

    // retorna a area do professor
    public String getArea() {
        return this.area;
    }

    // toString
    public String toString() {
        return super.toString() + ", professor da área " + this.area;
    }
}
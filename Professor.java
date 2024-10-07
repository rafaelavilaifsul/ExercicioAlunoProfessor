class Professor {
    // atributos
    private String nome;
    private String area;

    // construtor
    public Professor(String umNome, String umaArea) {
        this.nome = umNome;
        this.area = umaArea;
    }

    // retorna o nome do professor
    public String getNome() {
        return this.nome;
    }

    // retorna a area do professor
    public String getArea() {
        return this.area;
    }
}
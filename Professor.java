class Professor extends Pessoa {
    // atributos
    private String area;

    // construtor
    public Professor(String umNome, String umaArea) {
        super(umNome);
        this.area = umaArea;
    }

    // retorna a area do professor
    public String getArea() {
        return this.area;
    }
}
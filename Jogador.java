//NOME: IGOR BATISTA LIMA RA: 2475855
public abstract class Jogador{

    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private int numCamisa;
    protected String posicao;

    
    
    public Jogador(String nome, int idade, double peso, double altura, int numCamisa, String posicao2) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.numCamisa = numCamisa;
        this.posicao = posicao2;
    }
    public String getPosicao ()
    {
        return posicao;

    }
    public void setPosicao(String posicao){
        this.posicao = posicao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int getNumCamisa() {
        return numCamisa;
    }
    public void setNumCamisa(int numCamisa) {
        this.numCamisa = numCamisa;
    }
}
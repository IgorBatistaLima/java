//NOME: IGOR BATISTA LIMA RA: 2475855
public class Tecnico {

    private String nome;
    private String nacionalidade;
    private int numJogos;

    private int numVit;
    private int numDet;

    public Tecnico(String nome, String nacionalidade,int numJogos, int numVit, int numDet) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.numJogos = numJogos;
        this.numVit = numVit;
        this.numDet = numDet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getNumJogos() {
        return numJogos;
    }

    public void setNumJogos(int numJogos) {
        this.numJogos = numJogos;
    }
    public int getNumVit() {
        return numVit;
    }

    public void setNumVit(int numVit) {
        this.numVit = numVit;
    }

    public int getNumDet() {
        return numDet;
    }

    public void setNumDet(int numDet) {
        this.numDet = numDet;
    }

}

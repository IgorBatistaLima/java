//NOME: IGOR BATISTA LIMA RA: 2475855

public final class Atacante extends Jogador {
    
    
    private int numGols;
    private int golCab;
    
   

    public Atacante(String nome, int idade, double peso, double altura, int numCamisa, int numGols, String posicao,
            int golCab) {
        super(nome, idade, peso, altura, numCamisa,posicao);
        this.numGols = numGols;
        this.golCab = golCab;
    }

    public int getGolCab() {
        return golCab;
    }

    public void setGolCab(int golCab) {
        this.golCab = golCab;
    }

    public int getNumGols() {
        return numGols;
    }
    
    public void setNumGols(int numGols) {
        this.numGols = numGols;
    }
    @Override
    public String getNome() {
        return super.getNome() + " (Atacante "+ posicao +")";
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome + " (Atacante " + posicao + ")");
    }

    public String getPosica(){
        return posicao;

    }
    public void setPosicao(String posicao){
        this.posicao= posicao;
    }
}


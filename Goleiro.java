//NOME: IGOR BATISTA LIMA RA: 2475855


public final class Goleiro extends Jogador {
    
    private int defeDificeis;
    private int penalpegados;
    
    public Goleiro(String nome, int idade, double peso, double altura, int numCamisa, int defeDificeis,
            int penalpegados,String posicao) {
        super(nome, idade, peso, altura, numCamisa ,posicao);
        this.defeDificeis = defeDificeis;
        this.penalpegados = penalpegados;
    }
    public int getDefeDificeis() {
        return defeDificeis;
    }
    public void setDefeDificeis(int defeDificeis) {
        this.defeDificeis = defeDificeis;
    }
    public int getPenalpegados() {
        return penalpegados;
    }
    public void setPenalpegados(int penalpegados) {
        this.penalpegados = penalpegados;
    }
    
   
}

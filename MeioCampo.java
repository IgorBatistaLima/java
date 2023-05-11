//NOME: IGOR BATISTA LIMA RA: 2475855
public final class MeioCampo extends Jogador {
    
    private int numAssistencias;
    private int passeLongos;

    public MeioCampo(String nome, int idade, double peso, double altura, int numCamisa, int numAssistencias,
            String posicao, int passeLongos) {
        super(nome, idade, peso, altura, numCamisa,posicao);
        this.numAssistencias = numAssistencias;
        this.passeLongos = passeLongos;
    }

    public int getPasseLongos() {
        return passeLongos;
    }

    public void setPasseLongos(int passeLongos) {
        this.passeLongos = passeLongos;
    }

    public int getNumAssistencias() {
        return numAssistencias;
    }

    public void setNumAssistencias(int numAssistencias) {
        this.numAssistencias = numAssistencias;
    }

   

}

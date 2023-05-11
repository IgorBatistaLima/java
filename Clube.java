//NOME: IGOR BATISTA LIMA RA: 2475855
public class Clube {
    
    private String nome;
    private String presidente;
    private String pais;
    private String uf;
    
    
    public Clube(String nome, String presidente, String pais, String uf) {
        this.nome = nome;
        this.presidente = presidente;
        this.pais = pais;
        this.uf = uf;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}

//NOME: IGOR BATISTA LIMA RA: 2475855
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TstJog {

    public static void main(String[] args) throws IOException {
        InputStreamReader c = new InputStreamReader(System.in);
        BufferedReader cd = new BufferedReader(c);

        Leitura ler = new Leitura();

        int escolha;
        do {
            System.out.println("\n\t      ..:: MENU DE OPCOES ::..");
            System.out.println("\t[1] - INFORMAR DADOS DOS TIME (ATACANTES)");
            System.out.println("\t[2] - INFORMAR DADOS DOS TIME (MEIO-CAMPISTAS)");
            System.out.println("\t[3] - INFORMAR DADOS DOS TIME (DEFENSORES)");
            System.out.println("\t[4] - INFORMAR DADOS DOS TIME (GOLEIROS)");
            System.out.println("\t[0] SAIR");
            System.out.print("\n\n\tDIGITE O NUMERO : ");

            escolha = Integer.parseInt(cd.readLine());

            switch (escolha) {
                case 1:
                    Atacante a1 = new Atacante(null, escolha, escolha, escolha, escolha, escolha, null, escolha);
                    
                    a1.setNome(ler.entDados("\nInforme o nome do jogador:"));
                    a1.setIdade(Integer.parseInt(ler.entDados("Informe a idade:")));
                    a1.setPeso(Double.parseDouble(ler.entDados("Informe o peso:")));
                    a1.setAltura(Double.parseDouble(ler.entDados("Informe a altura:")));
                    a1.setNumCamisa(Integer.parseInt(ler.entDados("Informe o numero da camiseta:")));
                    a1.setPosicao(ler.entDados("Posicao:"));
                    a1.setNumGols(Integer.parseInt(ler.entDados("Numero de gols:")));
                    a1.setGolCab(Integer.parseInt(ler.entDados("Gols de Cabeca:")));;
                    System.out.println("\n\n");

                    System.out.println("\n\n\tInformacoes do jogador\n\n");
                    System.out.println("Nome: " +a1.getNome());
                    System.out.println("Idade:" +a1.getIdade());
                    System.out.println("Peso: "+a1.getPeso());
                    System.out.println("Altura: " +a1.getAltura());
                    System.out.println("Numero da camisa:" +a1.getNumCamisa());
                    System.out.println("Posicao: "+a1.getPosicao());
                    System.out.println("Numeros de Gols: "+a1.getNumGols());
                    System.out.println("Gols de cabeca: "+a1.getGolCab());


                    break;
                case 2:
                    MeioCampo m1 = new MeioCampo(null, escolha, escolha, escolha, escolha, escolha, null, escolha);
                    m1.setNome(ler.entDados("\nInforme o nome do jogador:"));
                    m1.setIdade(Integer.parseInt(ler.entDados("Informe a idade:")));
                    m1.setPeso(Double.parseDouble(ler.entDados("Informe o peso:")));
                    m1.setAltura(Double.parseDouble(ler.entDados("Informe a altura:")));
                    m1.setNumCamisa(Integer.parseInt(ler.entDados("Informe o numero da camiseta:")));
                    m1.setPosicao(ler.entDados("Posicao:"));
                    m1.setNumAssistencias(Integer.parseInt(ler.entDados("Numero de assistencias")));
                    m1.setPasseLongos(Integer.parseInt(ler.entDados("Passe Longos:")));


                    System.out.println("\n\n\tInformacoes do jogador\n\n");
                    System.out.println("Nome: " +m1.getNome());
                    System.out.println("Idade:" +m1.getIdade());
                    System.out.println("Peso: "+m1.getPeso());
                    System.out.println("Altura: " +m1.getAltura());
                    System.out.println("Numero da camisa:" +m1.getNumCamisa());
                    System.out.println("Posicao: "+m1.getPosicao());
                    System.out.println("Numeros de Assistencias: "+m1.getNumAssistencias());
                    System.out.println("Passe Longos: "+m1.getPasseLongos());
                  
                    break;
                case 3:
                    Defensor d1 = new Defensor(null, escolha, escolha, escolha, escolha, escolha, null, escolha);
                    d1.setNome(ler.entDados("\nInforme o nome do jogador:"));
                    d1.setIdade(Integer.parseInt(ler.entDados("Informe a idade:")));
                    d1.setPeso(Double.parseDouble(ler.entDados("Informe o peso:")));
                    d1.setAltura(Double.parseDouble(ler.entDados("Informe a altura:")));
                    d1.setNumCamisa(Integer.parseInt(ler.entDados("Informe o numero da camiseta:")));
                    d1.setPosicao(ler.entDados("Posicao;"));
                    d1.setDuelosAlto(Integer.parseInt(ler.entDados("Duelos ganho pelo alto:")));
                    d1.setNumDesarme(Integer.parseInt(ler.entDados("Numero de desarmes")));

                    System.out.println("\n\n\tInformacoes do jogador\n\n");
                    System.out.println("Nome: " +d1.getNome());
                    System.out.println("Idade:" +d1.getIdade());
                    System.out.println("Peso: "+d1.getPeso());
                    System.out.println("Altura: " +d1.getAltura());
                    System.out.println("Numero da camisa:" +d1.getNumCamisa());
                    System.out.println("Posicao: "+d1.getPosicao());
                    System.out.println("Duelos ganhos: "+d1.getDuelosAlto());
                    System.out.println("Desarmes: "+d1.getNumDesarme());
                
                case 4:
                    Goleiro g1 = new Goleiro(null, escolha, escolha, escolha, escolha, escolha, escolha, null);
                    g1.setNome(ler.entDados("\nInforme o nome do jogador:"));
                    g1.setIdade(Integer.parseInt(ler.entDados("Informe a idade:")));
                    g1.setPeso(Double.parseDouble(ler.entDados("Informe o peso:")));
                    g1.setAltura(Double.parseDouble(ler.entDados("Informe a altura:")));
                    g1.setNumCamisa(Integer.parseInt(ler.entDados("Informe o numero da camiseta:")));
                    g1.setDefeDificeis(Integer.parseInt(ler.entDados("Defesas Dificeis")));
                    g1.setPenalpegados(Integer.parseInt(ler.entDados("Penaltis pegados")));
                    break;
                case 0:
                    System.out.println("Saindo....");  
                    break;
                default:
                    System.out.println("\tOPCAO DO INVALIDA !!\n\n");
                    break;
            }
        } while (escolha != 0);

    }
}
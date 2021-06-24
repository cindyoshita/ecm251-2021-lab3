package yoshita.cindy.pedra_papel_tesoura2.models;

import yoshita.cindy.pedra_papel_tesoura2.enumeracoes.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if (verificarSeGanhei(jogada)) {
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(jogada)) {
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    private boolean verificarSeGanhei(Jogada jogada){
        for (Jogada jogadaAtual : jogadasQueGanho()){
            if (jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    };
    private boolean verificarSePerdi(Jogada jogada){
        for (Jogada jogadaAtual : jogadasQuePerco()){
            if (jogadaAtual.getClass() == jogada.getClass()){
                return true;
            }
        }
        return false;
    };
    public abstract Jogada[] jogadasQueGanho();
    public abstract Jogada[] jogadasQuePerco();
}
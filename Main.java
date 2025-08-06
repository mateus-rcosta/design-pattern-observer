import Clima.DadosClima;
import Clima.DisplayCondicoesAtual;
import Clima.DisplayEstatistica;

public class Main {
    public static void main(String[] args) {
        DadosClima dadosClima = new DadosClima();

        DisplayCondicoesAtual displayCondicoesAtual = new DisplayCondicoesAtual();
        DisplayEstatistica displayEstatistica = new DisplayEstatistica();

        dadosClima.registrarObservador(displayCondicoesAtual);
        dadosClima.registrarObservador(displayEstatistica);

        dadosClima.setMedidas(25.0, 65.0, 1013.0);
        dadosClima.setMedidas(27.0, 70.0, 1012.0);
        dadosClima.setMedidas(23.0, 90.0, 1011.0);
    }
}

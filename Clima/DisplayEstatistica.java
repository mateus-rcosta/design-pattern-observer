package Clima;

import interfaces.Observador;

public class DisplayEstatistica implements Observador {
    private double somaTemperatura = 0.0;
    private int numLeituras = 0;
    private double maxTemperatura;
    private double minTemperatura;
    private boolean primeiraLeitura = true;

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        somaTemperatura += temperatura;
        numLeituras++;

        if (primeiraLeitura) {
            maxTemperatura = temperatura;
            minTemperatura = temperatura;
            primeiraLeitura = false;
        } else {
            if (temperatura > maxTemperatura) {
                maxTemperatura = temperatura;
            }
            if (temperatura < minTemperatura) {
                minTemperatura = temperatura;
            }
        }

        exibir();
    }

    public void exibir() {
        System.out.println("Estatísticas -> Média: " + (somaTemperatura / numLeituras) +
                "°C, Máx: " + maxTemperatura + "°C, Mín: " + minTemperatura + "°C\n");
    }
}
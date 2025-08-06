package Clima;

import interfaces.Observador;

public class DisplayCondicoesAtual implements Observador {
    private double temperatura;
    private double umidade;

    @Override
    public void atualizar(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        exibir();
    }

    public void exibir() {
        System.out.println("Condições Atuais -> Temperatura: " + temperatura + "°C, Umidade: " + umidade + "%");
    }
}
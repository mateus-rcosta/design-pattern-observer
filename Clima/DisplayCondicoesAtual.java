package Clima;

import interfaces.Observer;

public class DisplayCondicoesAtual implements Observer {
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
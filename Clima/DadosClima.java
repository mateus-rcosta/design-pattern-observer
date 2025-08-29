package Clima;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;


public class DadosClima implements Subject {
    private List<Observer> observadores;
    private double temperatura;
    private double umidade;
    private double pressao;

    public DadosClima(){
        observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer Observador : observadores) {
            Observador.atualizar(temperatura, umidade, pressao);
        }        
    }

    public void medidasAlteradas() {
        notificarObservadores();
    }

    public void setMedidas(double temperatura, double umidade, double pressao) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        medidasAlteradas();
    }

    // Getters e Setters
    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }
}
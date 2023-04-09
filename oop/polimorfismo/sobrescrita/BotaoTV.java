package oop.polimorfismo.sobrescrita;

public class BotaoTV extends Botao {
    @Override
    public void ligar() {
        System.out.println("Ligando TV...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV...");
    }
}

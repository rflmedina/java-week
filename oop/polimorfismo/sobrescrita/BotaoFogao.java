package oop.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {
    @Override
    public void ligar() {
        System.out.println("Ligando fogão...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando fogão...");
    }
}

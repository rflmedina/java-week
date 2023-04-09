package oop.polimorfismo.sobrescrita;

public class Botao {
    
    // sobrescrita: mesmo nome de método, mesma assinatura, mas comportamento diferente

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }
}

package oop.abstracao;

public class ContaPoupanca implements Conta {
    @Override 
    public void consultarSaldo() {
        System.out.println("Saldo: R$ 100,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("Pix realizado com sucesso!");
    }
}

package oop.abstracao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo a Java Week da LinuxTips!");
        ContaPoupanca contaPoupancaRafaela = new ContaPoupanca();
        ContaCorrente contaCorrenteRafaela = new ContaCorrente();
        
        contaPoupancaRafaela.consultarSaldo();
        contaCorrenteRafaela.fazerPix();
    }
}

package oop.herenca;

public class FrontEndDev extends Dev {

    public FrontEndDev(String nome, String stack, Double salario) {
        super(nome, stack, salario);
        
    }

    @Override
    public void codar() {
        System.out.println("Front-end dev codando...");
    }
   
}

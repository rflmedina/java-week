package oop.herenca;

public class Main {
    public static void main(String[] args) {
        BackendDev dev1 = new BackendDev("João", "Java", 5000.0);
        FrontEndDev dev2 = new FrontEndDev("Maria", "JavaScript", 4000.0);

        dev1.codar();
        dev2.codar();
    }
}

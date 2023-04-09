package oop.polimorfismo;

public class Pagamento {
    // polimorfismo é a capacidade de um objeto de assumir várias formas


    // sobrecarga: mesmo nome de método, mas com assinaturas diferentes

    public Double pagamento(Double valor) {
        return valor;
    }

    public Integer pagamento(Integer valorInteger, Integer parcelas) {
        return valorInteger/parcelas;
    }

    public Long pagamento(Integer valorInteger, Integer parcelas, Long juros) {
        return (valorInteger/parcelas) + juros;
    }
}

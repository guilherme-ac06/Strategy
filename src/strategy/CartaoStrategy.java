package strategy;

public class CartaoStrategy implements PagamentoStrategy {

    @Override
    public double calcular(double valor) {
        return valor * 1.05;
    }
}
package app;

import model.Pedido;
import strategy.*;

public class Main {

    public static void main(String[] args) {

        Pedido pedido1 = new Pedido(200, new CartaoStrategy());
        System.out.println("Pagamento com Cartão: R$ " + pedido1.calcularTotal());

        Pedido pedido2 = new Pedido(200, new PixStrategy());
        System.out.println("Pagamento com Pix: R$ " + pedido2.calcularTotal());

        Pedido pedido3 = new Pedido(200, new BoletoStrategy());
        System.out.println("Pagamento com Boleto: R$ " + pedido3.calcularTotal());


        
        Pedido pedido4 = new Pedido(200, new CartaoStrategy());
        System.out.println("\nAlterando forma de pagamento...");
        
        pedido4.alterarEstrategia(new PixStrategy());
        System.out.println("Novo total com Pix: R$ " + pedido4.calcularTotal());
    }
}
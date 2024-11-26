package com.compras.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    // Uma lista de compras é associado ao cartão de crédito para controlar o limite
    // Lista com as compras realizadas
    private List<Compra> compras;

    // Esse método construtor exige que a classe seja iniciada com o limite do
    // cartão, o saldo que é igual ao limite e a criação da lista de compras
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    // O método verifica se o saldo é maior que a compra e se for verdadeiro
    // subtrai o valor do saldo com o valor da compra e adiciona a nova
    // compra na lista
    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }

        return false;
    }
}

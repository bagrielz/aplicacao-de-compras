package com.compras.modelos;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    // Método construtor que precisa ser iniciado com a
    // descrição e o valor da compra
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }

    // Compara o valor das compras e organiza a lista quado utilizado o Collection.sorts()
    // Dessa forma, o Collections.sort() ordena de acordo com os valores das compras
    @Override
    public int compareTo(Compra o) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(o.valor));
    }
}

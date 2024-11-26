import com.compras.modelos.CartaoDeCredito;
import com.compras.modelos.Compra;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do cartão:");
        double limite = leitura.nextDouble();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("\nDigite a descrição da compra:");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            // Após digitar a descrição e o valor da compra, o objeto é
            // criado passando esses valores como parâmetros da classe Compra
            Compra compra = new Compra(descricao, valor);
            // O objeto cartao é chamado juntamente ao método lancaCompra()
            // que recebe a compra como parâmetro e verifica se o saldo é menor ou igual
            // para realizar a operação
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("\nDigite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
        }

        System.out.println("Compras realizadas:\n");

        // Compra indica o tipo de cada elemento que será iterado
        // c é uma variável temporária que representa cada item da coleção durante a iteração
        // cartao.getCompras() é a coleção que está sendo iterada
        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }

        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
    }
}